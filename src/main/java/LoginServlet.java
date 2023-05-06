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


public class LoginServlet extends HttpServlet {
    private Connection conexion;

    @Override
    public void init() throws ServletException {
        super.init();
        // Establecer la conexión a la base de datos en el método init()
        String url = "jdbc:mysql://localhost:3306/sprint_m5";
        String usuario = "usuario";
        String contrasena = "contrasena";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(url, usuario, contrasena);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        LoginService auth = new LoginServiceImpl();
        Optional<String> usernameOptional = auth.getUsername(req);

        if (usernameOptional.isPresent()){
            resp.setContentType("text/html;charset=UTF-8");
            try (PrintWriter out = resp.getWriter()) {

                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("    <head>");
                out.println("        <meta charset=\"UTF-8\">");
                out.println("        <title>Hola " + usernameOptional.get() + "</title>");
                out.println("    </head>");
                out.println("    <body>");
                out.println("        <h1>Hola " + usernameOptional.get() + " ya has iniciado sesión con éxito!</h1>");
                out.println("        <p><a href='" + req.getContextPath() + "/index.html'>Volver</a></p>");
                out.println("        <p><a href='" + req.getContextPath() + "/logout'>Logout</a></p>");
                out.println("    </body>");
                out.println("</html>");
            }
        }else {
            getServletContext().getRequestDispatcher("/login.html").forward(req,resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        if (USERNAME.equals(username) && PASSWORD.equals(password)){

            HttpSession session = req.getSession();
            session.setAttribute("username", username);

            resp.sendRedirect(req.getContextPath() + "/login");
        }else {
            resp.sendRedirect(req.getContextPath() + "/login");
            //resp.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Lo sentimos no esta autorizado para ingresar a esta pagina!");
        }
    }