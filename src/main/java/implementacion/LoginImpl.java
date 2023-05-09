package implementacion;

import java.sql.ResultSet;
import java.sql.SQLException;
import controlador.ConexionBD_Login;
public class LoginImpl {
    public static void main(String[] args) throws SQLException, SQLException {
        String url = "jdbc:mysql://localhost:3306/sprint_m5";
        String usuario = "nombre_de_usuario";
        String contrasena = "contraseña_de_usuario";

        ConexionBD_Login conexion = new ConexionBD_Login(url, usuario, contrasena);

        ResultSet rs = conexion.ejecutarConsulta("SELECT nombre_usuario FROM usuarios");

        while (rs.next()) {
            String nombreUsuario;
            nombreUsuario = rs.getString("nombre_usuario");
            System.out.println(nombreUsuario);
        }

        conexion.cerrarConexion();
    }
}