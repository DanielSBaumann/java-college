package model;

import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import control.Admin;

public class MAdmin {

	public boolean cadastrar(Admin admin) {

		Session session;

		try {

			System.out.println("Model Admin -> Cadastrar");

			session = HibernateUtil.abrirSession();

			session.save(admin);

			session = HibernateUtil.fecharSession();

			System.out.println("Cadastro adcionado com sucesso!");

			return true;
		} catch (HibernateException e) {
			System.out.println("Erro: " + e.toString());
			return false;
		}

	}

	public List<Admin> user(int id) {

		Session session;

		List<Admin> list = null;

		try {

			session = HibernateUtil.abrirSession();

			String sql = "FROM Admin admin where admin.id=" + id;
			list = session.createQuery(sql, Admin.class).getResultList();

			session = HibernateUtil.fecharSession();

		} catch (HibernateException e) {
			System.out.println("Erro : " + e.toString());
		}

		return list;

	}

}
