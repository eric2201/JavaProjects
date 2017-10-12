package br.com.tcs.insurance.interfaces;

import java.util.List;

import br.com.tcs.insurance.model.Customer;

public interface CustomerDaoInt  {
		public boolean addCustomer(Customer customer);
		public boolean removeCustomer(int id);
		public boolean updateCustomer(int id, Customer customer);
		public List<Customer> listCustomers();
}
