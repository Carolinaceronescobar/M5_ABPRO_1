package controlador;

import implementacion.LoginServiceImpl;

import implementacion.LoginImpl;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.Optional;

public class LoginServlet extends HttpServlet {

    final static String USERNAME = "admin";
    final static String PASSWORD = "1234";
    private ConexionBD conexionBD;

    @Override
    public void init() throws ServletException {
        super.init();
        try {
            // Obtenemos la instancia de la conexión a través del patrón Singleton
            conexionBD = ConexionBD.obtenerInstancia();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void destroy() {
        super.destroy();
        try {
            // Cerramos la conexión al destruir el servlet
            ConexionBD.closeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }



    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        LoginServiceImpl auth = new LoginServiceImpl();
        Optional<String> usernameOptional = auth.getUsername(req);

        if (usernameOptional.isPresent()) {
            getServletContext().getRequestDispatcher("/").forward(req, resp);
        } else {

            RequestDispatcher dispatcher = req.getRequestDispatcher("login.jsp");
            dispatcher.forward(req, resp);
        }
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("usuario");
        String password = req.getParameter("contrasena");

        try {
            // Creamos la consulta para obtener el usuario y la contraseña

            String query = "SELECT * FROM usuarios WHERE usuario = ? AND contrasena = ?";
            PreparedStatement stmt = conexionBD.getConnection().prepareStatement(query);
            stmt.setString(1, username);
            stmt.setString(2, password);

            System.out.println(stmt);
            // Ejecutamos la consulta
            ResultSet rs = stmt.executeQuery();
            System.out.println(rs);
            if (rs.next()) {
                // Si se encontró un usuario con el username y la contraseña
                HttpSession session = req.getSession();
                session.setAttribute("username", username);
                resp.sendRedirect(req.getContextPath() + "/loginServlet");
            } else {
                // Si no se encontró un usuario con el username y la contraseña
                resp.sendRedirect(req.getContextPath() + "/login.jsp?error=1");
            }

            // Cerramos la conexión
            rs.close();
            stmt.close();

        } catch (SQLException e) {
            e.printStackTrace();
            resp.sendRedirect(req.getContextPath() + "/login.jsp?error=2");
        }
    }


/*    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("usuario");
        String password = req.getParameter("contrasena");

        if (this.USERNAME.equals(username) && this.PASSWORD.equals(password)) {
            System.out.println("ENTRE");

            HttpSession session = req.getSession();
            session.setAttribute("username", username);

            resp.sendRedirect(req.getContextPath() + "/loginServlet");
        } else {
            System.out.println("NO ENTRE");
            resp.sendRedirect(req.getContextPath() + "/loginServlet");
            //resp.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Lo sentimos no esta autorizado para ingresar a esta pagina!");
}
}*/
}
