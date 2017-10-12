package br.com.tcs.insurance.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import br.com.tcs.hibernateUtility.HibernateUtility;
import br.com.tcs.insurance.interfaces.AutoDaoInt;
import br.com.tcs.insurance.model.Auto;

public class AutoDao implements AutoDaoInt{

	SessionFactory factory = HibernateUtility.getSessionFactory();
	@Override
	public boolean addAuto(Auto auto) {
		Transaction tx = null;
		Session session = factory.openSession();
		try {
			tx = session.beginTransaction();
			session.save(auto);
			tx.commit();
			return true;
		}catch(HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
			return false;
		}
		
		
	
	}

	@Override
	public boolean removeAuto(int id) {
		Transaction tx = null;
		Session session = factory.openSession();
		
		try {
			tx = session.beginTransaction();
			Auto auto = session.get(Auto.class, id);
			session.delete(auto);
			tx.commit();
			return true;
		}catch(HibernateException e) {
			if(tx != null)
				tx.rollback();
			e.printStackTrace();
			return false;
		}
		
	}

	@Override
	public boolean updateAuto(int id, String carvalue) {
			Transaction tx = null;
			Session session = factory.openSession();
			
			try {
				tx = session.beginTransaction();
				Auto auto = session.get(Auto.class, id);
				auto.setCarvalue(carvalue);
				session.update(auto);
				tx.commit();
				return true;
			}catch(HibernateException e){
				if(tx!= null) {
					tx.rollback();
					e.printStackTrace();
					
				}
				return false;
			}
			
		
	}
	public List<Auto> listAuto() {
		Transaction tx = null;
		Session session = factory.openSession();
		try {
			tx = session.beginTransaction();
			List<Auto> listAuto = session.createQuery("FROM Auto").list();
			tx.commit();
			return listAuto;
		}catch(HibernateException e) {
			if(tx != null) {
				tx.rollback();
				e.printStackTrace();
			}
			return null;
		}
		
	}

}
