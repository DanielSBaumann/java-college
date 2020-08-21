package servlet;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import control.User;

@WebServlet("/ServLogin")
public class ServLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("Servlet Login ->");

		String login = request.getParameter("login");
		System.out.println(login);
		String senha = request.getParameter("senha");
		System.out.println(senha);

		List<User> list = new User().login(login, senha);

		if (!list.isEmpty()) {

			String op = list.get(0).getTipo();

			switch (op) {
			case "admin": {
				//AINDA NÃO FINALIZADO !!!//
				HttpSession session = request.getSession();
				session.setAttribute("user", list.get(0).getLogin());
				session.setAttribute("id", list.get(0).getId());
				request.getRequestDispatcher("index.jsp").forward(request, response);
				break;
			}
			case "aluno": {
				HttpSession session = request.getSession();
				session.setAttribute("user", list.get(0).getLogin());
				session.setAttribute("id", list.get(0).getId());
				request.getRequestDispatcher("index.jsp").forward(request, response);
				break;
			}
			default: {
				System.out.println("Erro");
			}
			}

		} else {

			System.out.println("Não foi possível efetuar o login!");
			request.getRequestDispatcher("login.html").forward(request, response);

		}

	}

}
