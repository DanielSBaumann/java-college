package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import control.Aluno;
import control.User;

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

			System.out.println("UPDATE ok");

			HttpSession session = request.getSession();

			User user = new User().user(Long.parseLong(session.getAttribute("id").toString()));

			Aluno aluno = new Aluno().user(user.getId_table());

			String nome = request.getParameter("nome");
			System.out.println(nome);
			String login = request.getParameter("login");
			System.out.println(login);
			String senha = request.getParameter("senha");
			System.out.println(senha);
			String cpf = request.getParameter("cpf");
			System.out.println(cpf);
			String email = request.getParameter("email");
			System.out.println(email);

			if (aluno.update(aluno, nome, cpf, email, login, senha)) {
				request.getRequestDispatcher("alunocadastro.jsp").forward(request, response);
			} else {
				System.out.println("Not ok");
			}

			break;
		}
		case "delete": {
			System.out.println("DELETE ok");
			request.getRequestDispatcher("login.html").forward(request, response);
			break;
		}
		case "exit": {

			break;
		}
		}
	}

}
