package controlador;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static final String USUARIO = "admin";
	private static final String PASS = "1234";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
        dispatcher.forward(request, response);		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String usuario = request.getParameter("usuario");
		String pass = request.getParameter("password");
		
		HttpSession session = request.getSession();

		if (USUARIO.equals(usuario) && PASS.equals(pass)) {
			//mensaje = "VALIDO";
			session.setAttribute("USUARIO", usuario);

			RequestDispatcher dispatcher = request.getRequestDispatcher("inicio.jsp");
			dispatcher.forward(request, response);

		} else {
			//mensaje = "NO VALIDO";
			session.removeAttribute("USUARIO");

			doGet(request, response);
		}
		
	}

}
