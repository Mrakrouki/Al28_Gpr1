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

public class MonMainTest {

	private static Logger log = Logger.getLogger(MonMainTest.class); 
	public static void main(String[] args) {
		log.info("debut de la méthode");
		Session session = null;
		Transaction tx = null;
		try {
			session = HibernateUtil.getSession();
			tx = session.beginTransaction();
			// ajoute 10 fois la meme personne en base
			
//			for(int i = 0; i<10; i++){
//				Personne pers = new Personne(null,"bla","blabla","encoredublabla",new Date());
//				session.save(pers);
//			}
//			Personne pers = new Personne(null,"bla","blabla","encoredublabla",new Date());
//			session.save(pers);
			
			Personne pers5 = (Personne)session.get(Personne.class, 5);
			log.info(pers5.toString());
			pers5.setNom("etNon");
			Compte cpt= new Compte(null,"du vent",pers5);
			session.save(cpt);
			Operation ope =new Operation(null, 150.0, "virement", cpt);
			Operation ope1 =new Operation(null, 120.0, "Credit", cpt);
			Operation ope2 =new Operation(null, 250.0, "Debit", cpt);
			Operation ope3 =new Operation(null, 387.0, "Detournement", cpt);
			session.save(ope);
			session.save(ope1);
			session.save(ope2);
			session.save(ope3);
			tx.commit();
			
			// recuperer toutes les entrees des tables
			String query = "FROM Personne";
			String query1 = "FROM Operation";
			String query2 = "FROM Compte";
			Query theQuery = session.createQuery(query);
			Query theQuery1 = session.createQuery(query1);
			Query theQuery2 = session.createQuery(query2);
			List<Personne> maListe = theQuery.list();
			List<Operation> malisteOp = theQuery1.list();
			List<Compte> malisteCom = theQuery2.list();
			for (Personne personne : maListe) {
				log.info(personne.toString());
				log.info(personne.getComptes().size());
				for (Compte compte : personne.getComptes()) {
					if(compte!=null){
					log.info(compte.getNumero());
					if(cpt.getOperations()!=null){
					for (Operation opera : compte.getOperations()) {
						log.info(opera.getMontant()+"***"+opera.getType());
					}
					}
					}
				}
			}
			for (Operation op : malisteOp) {
				log.info(op.toString());
			} 	
			for (Compte cpte : malisteCom) {
				log.info(cpte.toString());
			}
			// acces direct 
			Personne perso = cpt.getPers();
			log.info(perso.toString());
		} catch (Exception e) {
			log.fatal("pb de connexion au serveur"); 
			e.printStackTrace();
		} finally {
			try {
				session.close();
			} catch (HibernateException e) {
				log.fatal("pb lors de la cloture de la connexion");
				e.printStackTrace();
			}
		}
		log.info("fin de méthode");
	}

}
