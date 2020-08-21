package servlet;

import java.util.List;
import java.util.Scanner;
import control.Aluno;

public class MainTeste {

	public static void main(String[] args) {
		Aluno a = new Aluno();

		Scanner read = new Scanner(System.in);
		System.out.println("Digite nome do aluno : ");
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

		if (a.cadastrar(nome, cpf, email, login, senha, matricula)) {
			System.out.println("ok");
		} else {
			System.out.println("Not ok!");
		}

		read.close();
	}

}
