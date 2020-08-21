package model;

import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import control.User;

public class MUser {

	public boolean cadastrar(User user) {

		Session session;

		try {

			System.out.println("Model Aluno -> Cadastrar");

			session = HibernateUtil.abrirSession();

			session.save(user);

			session = HibernateUtil.fecharSession();

			System.out.println("Cadastro adcionado com sucesso!");

			return true;
		} catch (HibernateException e) {
			System.out.println("Erro: " + e.toString());
			return false;
		}

	}

	public List<User> login(User user) {

		System.out.println("Model User -> Login");

		Session session;

		List<User> list = null;

		try {

			session = HibernateUtil.abrirSession();

			String sql = "FROM User user where login like '%" + user.getLogin() + "%' and senha like '%"
					+ user.getSenha() + "%'";
			list = session.createQuery(sql, User.class).getResultList();

			session = HibernateUtil.fecharSession();

		} catch (HibernateException e) {
			System.out.println("Erro: " + e.toString());
		}

		return list;

	}

	public List<User> user(long id) {

		Session session;

		List<User> list = null;

		try {

			session = HibernateUtil.abrirSession();

			String sql = "FROM User user where user.id=" + id;
			list = session.createQuery(sql, User.class).getResultList();

			session = HibernateUtil.fecharSession();

		} catch (HibernateException e) {
			System.out.println("Erro : " + e.toString());
		}

		return list;

	}

}
