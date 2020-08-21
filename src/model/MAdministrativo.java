package model;

import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import control.Administrativo;

public class MAdministrativo {

	public boolean cadastrar(Administrativo admin) {

		Session session;

		try {

			System.out.println("Model Administrativo -> Cadastrar");

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

	public List<Administrativo> user(int id) {

		Session session;

		List<Administrativo> list = null;

		try {

			session = HibernateUtil.abrirSession();

			String sql = "FROM Administrativo admin where admin.id=" + id;
			list = session.createQuery(sql, Administrativo.class).getResultList();

			session = HibernateUtil.fecharSession();

		} catch (HibernateException e) {
			System.out.println("Erro : " + e.toString());
		}

		return list;

	}

}
