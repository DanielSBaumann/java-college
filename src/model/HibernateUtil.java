package model;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	private static Session session;
	public static String erro = null;

	public static Session abrirSession() {

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		session = sessionFactory.openSession();
		session.beginTransaction();
		return session;

	}

	public static Session fecharSession() {
		try {
			if (session != null) {
				session.getTransaction().commit();
			}
		} catch (HibernateException e) {
			session.getTransaction().rollback();
			erro = e.toString();
		} finally {
			session.close();
		}
		return session;
	}

}
