package controlador;

import java.sql.*;

public class ConexionBD {
    private static ConexionBD instancia = null;
    private static String url = "jdbc:mysql://localhost:3306/sprint6";
    private static String user = "root";
    private static String pass = "";
    private static Connection connection = null;

    private ConexionBD() throws SQLException, ClassNotFoundException {
        System.out.println("Conectando...");
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection(url, user, pass);
        System.out.println(connection);
        System.out.println("Conectado");
    }

    public static ConexionBD obtenerInstancia() throws SQLException, ClassNotFoundException {
        if (instancia == null) {
            instancia = new ConexionBD();
        }
        return instancia;
    }

    public static void closeConnection() throws SQLException {
        if (connection != null) {
            connection.close();
        }
    }

    public Connection getConnection() {
        return connection;
    }



}
