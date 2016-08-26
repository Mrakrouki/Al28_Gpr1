package fr.afcepf.al28.main;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import fr.afcepf.al28.data.Personne;
import fr.afcepf.al28.util.HibernateUtil;

public class TestRequete {
	private static Logger log = Logger.getLogger(TestRequete.class);
public static void main (String[] args){
	Session session = null;
	Transaction tx = null;
	
	session = HibernateUtil.getSession();
	tx = session.beginTransaction();
	
	// SQL
	String reqSelect ="Select id, nom, prenom, adresse, naissance FROM personne";
	Query sql = session.createSQLQuery(reqSelect);
	List<Object[]> result = sql.list();
	for (Object[] objects : result) {
		log.info(objects[0]+" "+objects[1]+" "+objects[2]+" "+objects[3]+" "+objects[4]);
	}
	
	// HQL
	String reqHql = "FROM Personne";
	Query hql = session.createQuery(reqHql);
	List<Personne> resultat = hql.list();
	for (Personne personne : resultat) {
		log.info(personne.toString());
	}
	
	// HQL avec param
	String reqHqlParam = "FROM Personne p WHERE p.nom = :nom";
	Query hqlParam = session.createQuery(reqHqlParam);
	hqlParam.setParameter("nom", "etNon");
	List<Personne> result2 = hqlParam.list();
	for (Personne personne : result2) {
		log.info(personne.toString());
	}
	tx.rollback();
	
}
	
}
