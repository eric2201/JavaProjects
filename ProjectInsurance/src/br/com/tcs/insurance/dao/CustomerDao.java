package br.com.tcs.insurance.dao;

import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import br.com.tcs.hibernateUtility.HibernateUtility;
import br.com.tcs.insurance.interfaces.CustomerDaoInt;
import br.com.tcs.insurance.model.Customer;

public class CustomerDao implements CustomerDaoInt {

	private SessionFactory factory = HibernateUtility.getSessionFactory();

	@Override
	public boolean addCustomer(Customer customer) {
		Session session = factory.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.save(customer);
			tx.commit();
			return true;
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
			return false;
		}

	}

	@Override
	public boolean removeCustomer(int id) {
		Session session = factory.openSession();
		Transaction tx = null;
		Integer idobj = new Integer(id);

		try {
			tx = session.beginTransaction();
			Customer customer = session.get(Customer.class, idobj);
			if(customer != null) {
			session.delete(customer);
			tx.commit();
			return true;
			}else
				return false;
			

		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
		
			return false;

		}
	}

	@Override
	public boolean updateCustomer(int id, Customer customer) {
		Session session = factory.openSession();
		Transaction tx = null;
		Integer idobj = new Integer(id);
		try {
			tx = session.beginTransaction();
			Customer customer2 = session.get(Customer.class, idobj);
			if(customer2 != null) {
			String name = customer.getName();
			String lname = customer.getLast_name();
			String nationality = customer.getNationality();
			String address = customer.getAddress();
			String city = customer.getCity();
			String  state = customer.getState();
			customer2.setName(name);
			customer2.setLast_name(lname);
			customer2.setNationality(nationality);
			customer2.setAddress(address);
			customer2.setCity(city);
			customer2.setState(state);
			session.update(customer2);
			tx.commit();
			return true;
			}else
				return false;

		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
			return false;
		}

	}

	@Override
	public List<Customer> listCustomers() {
		Session session = factory.openSession();
		Transaction tx = null;

		try {
			tx = session.beginTransaction();
			List<Customer> listCustomer = session.createQuery("FROM Customer").list();
			tx.commit();
			return listCustomer;

		} catch (HibernateException e) {
			if (tx != null) {
				tx.rollback();
				e.printStackTrace();
			}
			return null;
		}

	}
}
