package entity;

import org.hibernate.Session;

public class MonMain {

	public static void main(String[] args) {

		Session session = HibernateUtil.getSession();
		org.hibernate.Transaction tx = session.beginTransaction();
		
		tx.begin();
		
		Activite acti = new Activite();
		
	}

}
