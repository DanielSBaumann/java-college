package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import control.*;

@WebServlet("/ServCadastrar")
public class ServCadastrar extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("Servlet Cadastrar ->");

		String tipo = request.getParameter("tipo");
		System.out.println(tipo);

		switch (tipo) {
		case "1": {
			// admin
			System.out.println("Case admin");

			String nome = request.getParameter("nome");
			System.out.println(nome);
			String login = request.getParameter("login");
			System.out.println(login);
			String senha = request.getParameter("senha");
			System.out.println(senha);
			String cpf = request.getParameter("cpf");
			System.out.println(cpf);
			String tel = request.getParameter("tel");
			System.out.println(tel);
			String endereco = request.getParameter("endereco");
			System.out.println(endereco);
			String email = request.getParameter("email");
			System.out.println(email);
			String niver = request.getParameter("niver");
			System.out.println(niver);

			Admin admin = new Admin();

			if (admin.cadastrar(nome, cpf, email, login, senha)) {
				User u = new User();

				if (u.cadastrar(admin.getId(), "admin", login, senha)) {
					System.out.println("Ok");
				} else {
					System.out.println("User not ok!");
				}

			} else {
				System.out.println("Not ok!");
			}

			break;
		}
		case "2": {
			// administrativo
			System.out.println("Case administrativo");

			String nome = request.getParameter("nome");
			System.out.println(nome);
			String login = request.getParameter("login");
			System.out.println(login);
			String senha = request.getParameter("senha");
			System.out.println(senha);
			String cpf = request.getParameter("cpf");
			System.out.println(cpf);
			String tel = request.getParameter("tel");
			System.out.println(tel);
			String endereco = request.getParameter("endereco");
			System.out.println(endereco);
			String email = request.getParameter("email");
			System.out.println(email);
			String niver = request.getParameter("niver");
			System.out.println(niver);

			Administrativo admin = new Administrativo();

			if (admin.cadastrar(nome, cpf, email, login, senha)) {
				User u = new User();

				if (u.cadastrar(admin.getId(), "administrativo", login, senha)) {
					System.out.println("Ok");
				} else {
					System.out.println("User not ok!");
				}

			} else {
				System.out.println("Not ok!");
			}

			break;
		}
		case "3": {
			// funcionario
			break;
		}
		case "4": {
			// professor
			System.out.println("Case professor");

			String nome = request.getParameter("nome");
			System.out.println(nome);
			String login = request.getParameter("login");
			System.out.println(login);
			String senha = request.getParameter("senha");
			System.out.println(senha);
			String cpf = request.getParameter("cpf");
			System.out.println(cpf);
			String tel = request.getParameter("tel");
			System.out.println(tel);
			String endereco = request.getParameter("endereco");
			System.out.println(endereco);
			String email = request.getParameter("email");
			System.out.println(email);
			String niver = request.getParameter("niver");
			System.out.println(niver);

			Professor p = new Professor();

			if (p.cadastrar(nome, cpf, email, login, senha)) {

				User u = new User();

				if (u.cadastrar(p.getId(), "professor", login, senha)) {
					System.out.println("User Ok");
				} else {
					System.out.println("User not ok!");
				}

			} else {
				System.out.println("Not ok!");
			}

			break;
		}
		case "5": {
			// aluno
			System.out.println("Case aluno");

			String nome = request.getParameter("nome");
			System.out.println(nome);
			String login = request.getParameter("login");
			System.out.println(login);
			String senha = request.getParameter("senha");
			System.out.println(senha);
			String cpf = request.getParameter("cpf");
			System.out.println(cpf);
			String tel = request.getParameter("tel");
			System.out.println(tel);
			String endereco = request.getParameter("endereco");
			System.out.println(endereco);
			String email = request.getParameter("email");
			System.out.println(email);
			String niver = request.getParameter("niver");
			System.out.println(niver);

			Aluno a = new Aluno();

			if (a.cadastrar(nome, cpf, email, login, senha)) {

				User u = new User();

				if (u.cadastrar(a.getId(), "aluno", login, senha)) {
					System.out.println("User Ok");
				} else {
					System.out.println("User not ok!");
				}

			} else {
				System.out.println("Not ok!");
			}
			break;
		}
		case "6": {
			// responsavel
			break;
		}
		}
	}

}
