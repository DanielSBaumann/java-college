package model;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import control.Professor;

public class MProfessor {

	public boolean cadastrar(Professor prof) {

		Session session;

		try {

			System.out.println("Model Professor -> Cadastrar");

			session = HibernateUtil.abrirSession();

			session.save(prof);

			session = HibernateUtil.fecharSession();

			System.out.println("Cadastro adcionado com sucesso!");

			return true;
		} catch (HibernateException e) {
			System.out.println("Erro: " + e.toString());
			return false;
		}

	}

	public List<Professor> user(int id) {

		Session session;

		List<Professor> list = null;

		try {

			session = HibernateUtil.abrirSession();

			String sql = "FROM Professor prof where prof.id=" + id;
			list = session.createQuery(sql, Professor.class).getResultList();

			session = HibernateUtil.fecharSession();

		} catch (HibernateException e) {
			System.out.println("Erro : " + e.toString());
		}

		return list;

	}

}
