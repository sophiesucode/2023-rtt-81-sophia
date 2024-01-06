package com.suleman.hibernateuser.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
/**
 * Hibernate connects to database
 */
public class HibernateUtil {
	
	
	
	public static Session getConnection() {
		SessionFactory factory= new Configuration().configure().buildSessionFactory();
		Session session= factory.openSession();
		return session;
	}

}
