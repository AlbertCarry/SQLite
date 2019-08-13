package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    static Connection instance = null;

    private DBConnection() {}

    public static Connection driverConnection(){
        try {
            instance = DriverManager.getConnection("jdbc:sqlite:testdb");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return instance;
    }
}
