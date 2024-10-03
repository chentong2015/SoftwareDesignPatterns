package spi.jdbc_driver;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverAction;
import java.sql.SQLException;
import java.util.Properties;
import java.util.concurrent.CopyOnWriteArrayList;

// DriverManager实现对不同Driver的管理，使用正确的Driver连接不同的数据库
public class JavaDriverManager {

    // 添加同步锁，在移除Driver的实现对象时保证安全
    private final static Object lockForInitDrivers = new Object();
    // 多线程并发安全的数据结构
    private final static CopyOnWriteArrayList<MyDriverInfo> registeredDrivers = new CopyOnWriteArrayList<>();

    // TODO. register将Driver的实现对象DriverManager的缓存List中
    public static void registerDriver(java.sql.Driver driver, DriverAction da) {
        /* Register the driver if it has not already been added to our list */
        if (driver != null) {
            registeredDrivers.addIfAbsent(new MyDriverInfo(driver, da));
        } else {
            // This is for compatibility with the original DriverManager
            throw new NullPointerException();
        }
    }

    public static void deregisterDriver(Driver driver) throws SQLException {
        if (driver == null) {
            return;
        }
        MyDriverInfo aDriver = new MyDriverInfo(driver, null);
        synchronized (lockForInitDrivers) {
            if (registeredDrivers.contains(aDriver)) {
                registeredDrivers.remove(aDriver);
            } else {
                System.out.println("Couldn't find driver to unload");
            }
        }
    }

    // TODO. Driver.getConnection()本质上是通过调用Driver的实现类实现的connect()方法来创建连接
    // driver.connect(url, info) 接受连接的url和properties
    // driver.connect(url, info) 方法具体由DB Driver来实现
    private static Connection getConnection(String url, Properties info, Class<?> caller) throws SQLException {
        // ...
        // Walk through the loaded registeredDrivers attempting to make a connection.
        // Remember the first exception that gets raised so we can reraise it.
        ClassLoader callerCL = caller != null ? caller.getClassLoader() : null;
        for (MyDriverInfo aDriver : registeredDrivers) {
            if (isDriverAllowed(aDriver.driver, callerCL)) {
                try {
                    Connection con = aDriver.driver.connect(url, info);
                    if (con != null) {
                        return (con);
                    }
                } catch (SQLException ex) {
                    System.out.println("Failed to get connection");
                }
            } else {
                System.out.println("skipping: " + aDriver.getClass().getName());
            }
        }
        throw new SQLException("No suitable driver found for " + url, "08001");
    }

    // Indicates whether the class object that would be created if the code calling
    // DriverManager is accessible.
    private static boolean isDriverAllowed(Driver driver, Class<?> caller) {
        ClassLoader callerCL = caller != null ? caller.getClassLoader() : null;
        return isDriverAllowed(driver, callerCL);
    }

    private static boolean isDriverAllowed(Driver driver, ClassLoader classLoader) {
        boolean result = false;
        if (driver != null) {
            Class<?> aClass = null;
            try {
                aClass = Class.forName(driver.getClass().getName(), true, classLoader);
            } catch (Exception ex) {
                result = false;
            }
            result = (aClass == driver.getClass()) ? true : false;
        }
        return result;
    }
}