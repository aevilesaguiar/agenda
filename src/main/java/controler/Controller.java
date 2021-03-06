package controler;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.DAO;

@WebServlet(urlPatterns = { "/Controller", "/main" })
public class Controller extends HttpServlet {// classe principal do Servlet
	private static final long serialVersionUID = 1L;
	DAO dao = new DAO();

	public Controller() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {// M?todo principal do Servlet

		String action = request.getServletPath();
		System.out.println(action);

		if (action.equals("/main")) {
			contatos(request, response);	

		}
	}

	// Listar Contatos
	protected void contatos(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.sendRedirect("agenda.jsp");
	}

}
