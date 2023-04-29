package core_structure_patterns.facade;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

// Facade Pattern: 外观模式 => 系统中使用统一的API，隐藏封装的API的复杂性
// 为子系统中一组接口提供一个一致的界面，此模式定义高层接口，这个接口使得这一子系统更加容易使用
// Facade pattern hides the complexities of the system and provides an interface to the client using which the client can access the system.
// This type of design pattern comes under structural pattern as this pattern adds an interface to existing system to hide its complexities.
public class MyConnection {

    private Connection connection;

    public MyConnection(String connectionString) {
        try {
            connection = DriverManager.getConnection(connectionString);
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }

    public void storeData(Object data) throws SQLException {
        int count = connection.createStatement().executeUpdate("sql");
        System.out.println(count);
    }

    public String getDataNameById(int id) throws SQLException {
        ResultSet resultSet = connection.createStatement().executeQuery("sql");
        if (resultSet.next()) {
            return resultSet.getString("name");
        }
        return "empty";
    }
}
