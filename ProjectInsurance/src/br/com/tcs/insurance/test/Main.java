package br.com.tcs.insurance.test;

import java.util.List;

import br.com.tcs.hibernateUtility.HibernateUtility;
import br.com.tcs.insurance.dao.AutoDao;
import br.com.tcs.insurance.dao.AutoInsuranceProductDao;
import br.com.tcs.insurance.dao.CustomerDao;
import br.com.tcs.insurance.model.AutoInsuranceProduct;
import br.com.tcs.insurance.model.Customer;

public class Main {

	public static void main(String[] args) {
		HibernateUtility.getSessionFactory();
		AutoDao ad = new AutoDao();

		/*
		 * List<Auto> listAuto = ad.listAuto(); for (Auto a : listAuto) {
		 * System.out.println(a.toString()); }
		 */
		CustomerDao cd = new CustomerDao();
		Customer c1 = new Customer("","","","","","","","");
		cd.updateCustomer(69, c1);
		
		
		
	}
}
