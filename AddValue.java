package DataBase;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class AddValue {
    private String namedb;
    private String name;
    private int age;
    private String id;

    public AddValue(String namedb, String name, int age) {
        this.namedb = namedb;
        this.id = "?";
        this.name = name;
        this.age = age;
    }

    public void addVal() {
        String sqlzapros = "insert into People (id,NameTEXT,Age) values " +
                "(" + "?" + "," + "'" + name + "'" + "," + age + ")";
        Connection connection = DBConnection.driverConnection();
        try {
            Statement statement = connection.createStatement();
            statement.execute(sqlzapros);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
