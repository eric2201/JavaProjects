package br.com.tcs.hibernateUtility;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtility {
	public static SessionFactory getSessionFactory(){
		SessionFactory sessionFactory;
		try {
			sessionFactory = new Configuration().configure().buildSessionFactory();
			return sessionFactory;
		}catch(Throwable ex) {
			System.err.println("Failed to create sessionFactory object." + ex);
	         throw new ExceptionInInitializerError(ex);  
		}
		
	}
}
