package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static String URL = "jbdc:mysql://localhost:3306/javaweb";
    private static String USERNAME = "root";
    private static String PASSWORD = "";

    public static Connection getConnection() throws SQLException {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (Exception e) {

        }

        Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        System.out.println("hola");
        return conn;
        //return DriverManager.getConnection("jdbc:mysql://localhost:3306/javaweb?serverTimezone=America/Santiago", "root", "");
    }
}
