import java.sql.*;

public class ConexionBD_Login {


    private final Connection conexion;
    //El constructor de la clase, que establece la conexión a la base de datos MySQL
    // utilizando la URL de conexión, el nombre de usuario y la contraseña especificados como parámetros
    public ConexionBD_Login(String url, String usuario, String contrasena) throws SQLException {
        conexion = DriverManager.getConnection(url, usuario, contrasena);
    }

    //El método ejecutarConsulta, que ejecuta una consulta SQL especificada
    // como parámetro y devuelve un objeto ResultSet que contiene los resultados de la consulta.
    public ResultSet ejecutarConsulta(String consulta) throws SQLException {
        Statement stmt = conexion.createStatement();
        return stmt.executeQuery(consulta);
    }
    //El método cerrarConexion, que cierra la conexión a la base de datos.
    public void cerrarConexion() throws SQLException {
        conexion.close();
    }

   

}
