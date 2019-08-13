package DataBase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CreateTable {
    private String namedb;
    public CreateTable(String namedb) {
        this.namedb = namedb;
    }
    public void CreateTb(){
        String sqlzapros = "create table "+ namedb +
                " (id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT)";
        Connection connection = DBConnection.driverConnection();
        try {
            Statement st = connection.createStatement();
            st.execute(sqlzapros);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
