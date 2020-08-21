package model;

import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import control.Aluno;

public class MAluno {

	public boolean cadastrar(Aluno aluno) {

		Session session;

		try {

			System.out.println("Model Aluno -> Cadastrar");

			session = HibernateUtil.abrirSession();

			session.save(aluno);

			session = HibernateUtil.fecharSession();

			System.out.println("Cadastro adcionado com sucesso!");

			return true;
		} catch (HibernateException e) {
			System.out.println("Erro: " + e.toString());
			return false;
		}

	}

	public List<Aluno> doLogin(Aluno aluno) {

		System.out.println("Model Aluno -> Login");

		Session session;

		List<Aluno> list = null;

		try {

			session = HibernateUtil.abrirSession();
			
			String sql = "FROM Aluno aluno where login like '%" + aluno.getLogin() + "%' and senha like '%" + aluno.getSenha() + "%'";
			list = session.createQuery(sql, Aluno.class).getResultList();

			session = HibernateUtil.fecharSession();

		} catch (HibernateException e) {
			System.out.println("Erro: " + e.toString());
		}

		return list;

	}

	public List<Aluno> user(int id) {

		Session session;

		List<Aluno> list = null;

		try {

			session = HibernateUtil.abrirSession();

			String sql = "FROM Aluno aluno where aluno.id=" + id ;
			list = session.createQuery(sql, Aluno.class).getResultList();

			list.forEach(aluno -> {
				System.out.println(aluno.getNome());
			});

			session = HibernateUtil.fecharSession();

		} catch (HibernateException e) {
			System.out.println("Erro : " + e.toString());
		}
		
		return list;

	}

}
