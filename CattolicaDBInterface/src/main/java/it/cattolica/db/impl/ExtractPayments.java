package it.cattolica.db.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import it.cattolica.db.entities.Payment;
import it.cattolica.db.util.HibernateUtil;

public class ExtractPayments {
	
	
	public List<Payment> getPayments(){
			
		Session session = HibernateUtil.getSessionFactory().openSession();
	    session.beginTransaction();
	    
	    Configuration config=new Configuration();
	    config.addAnnotatedClass(Payment.class);
	    config.configure();
	    
	
	    // Check database version
	    String sql = "select p from " + Payment.class.getName() + " p";
	    
	    @SuppressWarnings("unchecked")
		Query<Payment> query = session.createQuery(sql);
	
	    List<Payment> result = query.getResultList();
	    System.out.println(result);
	
	    session.getTransaction().commit();
	    session.close();
	
	    
//	    HibernateUtil.shutdown();
    
	    return result;
	}
	
	public void savePayments(List<Payment> payments) {
		Session session = HibernateUtil.getSessionFactory().openSession();
	    session.beginTransaction();
		for(Payment payment : payments) {
			session.save(payment);
		}
		
		session.getTransaction().commit();
		session.close();
	}
}
