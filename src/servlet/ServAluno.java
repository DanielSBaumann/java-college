package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServAluno")
public class ServAluno extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("Servlet Aluno");

		String action = request.getParameter("action");

		switch (action) {

		case "home": {
			System.out.println("Case home");
			request.getRequestDispatcher("aluno.jsp").forward(request, response);
			break;
		}
		case "profile": {
			System.out.println("Case Profile");
			request.getRequestDispatcher("alunocadastro.jsp").forward(request, response);
			break;
		}
		case "update": {

			break;
		}
		case "exit": {

			break;
		}

		}
	}

}
