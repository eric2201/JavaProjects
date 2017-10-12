package br.com.tcs.insurance.dao;

import java.util.List;

import org.apache.tomcat.util.digester.FactoryCreateRule;
import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import br.com.tcs.hibernateUtility.HibernateUtility;
import br.com.tcs.insurance.interfaces.AutoInsuranceProductDaoInt;
import br.com.tcs.insurance.model.AutoInsuranceProduct;

public class AutoInsuranceProductDao implements AutoInsuranceProductDaoInt {

	SessionFactory factory = HibernateUtility.getSessionFactory();

	@Override
	public boolean addAutoInsuranceProduct(AutoInsuranceProduct autoInsuranceProduct) {
		Transaction tx = null;
		Session session = factory.openSession();

		try {
			tx = session.beginTransaction();
			session.save(autoInsuranceProduct);
			tx.commit();
			return true;
		} catch (HibernateException e) {
			if (tx != null) {
				tx.rollback();
				e.printStackTrace();
				
			}
			return false;

		}
	}

	@Override
	public boolean removeAutoInsuranceProduct(int id) {
		Transaction tx = null;
		Session session = factory.openSession();
		
		try {
			tx = session.beginTransaction();
			AutoInsuranceProduct aip = session.get(AutoInsuranceProduct.class, id);
			session.delete(aip);
			tx.commit();
			return true;
		}catch (HibernateException e) {
			if(tx != null) {
				tx.rollback();
				e.printStackTrace();
			}
			return false;
		}
		
	}

	@Override
	public boolean updateAutoInsuranceProduct(int id, String description) {
		Transaction tx = null;
		Session session = factory.openSession();
		
		try {
			tx = session.beginTransaction();
			AutoInsuranceProduct aip = session.get(AutoInsuranceProduct.class, id);
			aip.setDescription(description);
			session.update(aip);
			tx.commit();
			return true;
		}catch(HibernateException e) {
			if (tx != null) {
				tx.rollback();
				e.printStackTrace();
			}
			return false;
		}
		
	}

	@Override
	public List<AutoInsuranceProduct> listAutoInsuranceProduct() {
		Transaction tx = null;
		Session session = factory.openSession();
		
		try {
			tx = session.beginTransaction();
			List<AutoInsuranceProduct> listAutoInsuranceProduct= session.createQuery("From AutoInsuranceProduct").list();
			tx.commit();
			return listAutoInsuranceProduct;
		}catch(HibernateException e) {
			if (tx != null) {
				tx.rollback();
				e.printStackTrace();
			}
			return null;
		}
		
	}

}
