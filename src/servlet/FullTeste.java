package servlet;

import java.util.Scanner;
import control.Admin;
import control.Aluno;
import control.User;

public class FullTeste {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		System.out.println(
				"Selecione o tipo de usuario a ser cadastrado : \n1-Funcionario\n2-Professor\n3-Aluno\n4-Responsavel");
		String op = read.nextLine();

		System.out.println("Digite nome : ");
		String nome = read.nextLine();

		System.out.println("CPF : ");
		String cpf = read.nextLine();

		System.out.println("Email : ");
		String email = read.nextLine();

		System.out.println("Login : ");
		String login = read.nextLine();

		System.out.println("Matricula : ");
		String matricula = read.nextLine();

		System.out.println("Senha : ");
		String senha = read.nextLine();

		switch (op) {
		case "1": {
			System.out.println("Entrou aqui! 1");
			break;
		}
		case "2": {

			break;
		}
		case "3": {

			Aluno a = new Aluno();

			if (a.cadastrar(nome, cpf, email, login, senha, matricula)) {

				System.out.println(a.getId());

				User u = new User();

				if (u.cadastrar(a.getId(), "aluno", login, senha)) {
					System.out.println("Ok");
				} else {
					System.out.println("User not ok!");
				}

			} else {
				System.out.println("Not ok!");
			}

			break;
		}
		case "4": {

			break;
		}
		case "5": {
			System.out.println("Entrou aqui! 5");
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
		default: {
			System.out.println("Opção invalida");
		}
		}

		read.close();

	}

}
