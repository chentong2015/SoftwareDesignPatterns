package java_jdbc_driver;

import java.sql.*;
import java.util.Properties;
import java.util.logging.Logger;

// 不同的数据库都需要实现指定的Driver接口，Java层面不关心具体实现类型
// 1. 统一文件名称: /META-INF/Services/java.sql.Driver
// 2. 实现类型实现: 不同的数据库jar包上配置的实现类型不同
public class MyDBServerDriver implements Driver {

    private static Driver myDbServerDriver;

    // TODO. 需要将是实现的Driver实例注册到DriverManager中
    public static void register() throws SQLException {
        if (myDbServerDriver == null) {
            myDbServerDriver = new MyDBServerDriver();
            DriverManager.registerDriver(myDbServerDriver);
        }

    }

    public static void deregister() throws SQLException {
        if (myDbServerDriver != null) {
            DriverManager.deregisterDriver(myDbServerDriver);
            myDbServerDriver = null;
        }
    }

    // TODO. 真正创建数据库连接的方法，使用特定的方式连接到底层数据库
    @Override
    public Connection connect(String url, Properties info) throws SQLException {
        return null;
    }

    @Override
    public boolean acceptsURL(String url) throws SQLException {
        return false;
    }

    @Override
    public DriverPropertyInfo[] getPropertyInfo(String url, Properties info) throws SQLException {
        return new DriverPropertyInfo[0];
    }

    @Override
    public int getMajorVersion() {
        return 0;
    }

    @Override
    public int getMinorVersion() {
        return 0;
    }

    @Override
    public boolean jdbcCompliant() {
        return false;
    }

    @Override
    public Logger getParentLogger() throws SQLFeatureNotSupportedException {
        return null;
    }
}
