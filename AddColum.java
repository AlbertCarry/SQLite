package DataBase;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class AddColum {
    private String namedb;
    private String nameColum;
    private String value;

    public AddColum(String namedb, String nameColum, String value) {
        this.namedb = namedb;
        this.nameColum = nameColum;
        this.value = value;
    }

    public void addColum(){
        String sqlzapros = "alter table " + namedb + " ADD COLUMN " + nameColum +" "+value;
        Connection connection = DBConnection.driverConnection();
        try {
            Statement statement = connection.createStatement();
            statement.execute(sqlzapros);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
