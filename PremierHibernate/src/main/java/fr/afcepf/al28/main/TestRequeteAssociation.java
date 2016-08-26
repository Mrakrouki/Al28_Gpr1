package fr.afcepf.al28.main;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import fr.afcepf.al28.data.Compte;
import fr.afcepf.al28.data.Operation;
import fr.afcepf.al28.data.Personne;
import fr.afcepf.al28.util.HibernateUtil;

public class TestRequeteAssociation {

	private static Logger log = Logger.getLogger(TestRequeteAssociation.class);
	public static void main(String[] args) {

		Session session = null;
		Transaction tx = null;
		
		try {
			session = HibernateUtil.getSession();
			tx=session.beginTransaction();
			
			String reqHql = "Select op From Operation op WHERE op.type = 'Debit' AND op.compte.pers.id = 5";
			Query hql = session.createQuery(reqHql);
			List<Operation> result = hql.list();
			for (Operation operation : result) {
				log.info(operation.getMontant());
			}
			
			// tous les comptes
			
			List<Personne> personne = session.createQuery("FROM Personne p WHERE p.id = 5").list();
			List<Compte> comptes = personne.get(0).getComptes();
			log.info(personne.get(0).toString());
			log.info(comptes.size());
			for (Compte compte : comptes) {
				if(compte!=null){
				log.info(compte.toString());
				}
			}
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			log.fatal("Ben ca a planté");
			e.printStackTrace();
		}
		
	}

}
