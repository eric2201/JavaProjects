package br.com.tcs.insurance.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table
public class Auto {
	@Id
	private int id;
	private String chassi;
	private String brand;
	private String model;
	private String category;
	private String carvalue;
	@ManyToOne
	@JoinColumn(name="Customer_id")
	Customer customer;
	
	public Auto() {
		customer = new Customer();
	}
	
	public Auto(String chassi, String brand, String model, String category, String carvalue, int customer_id) {
		super();
		this.chassi = chassi;
		this.brand = brand;
		this.model = model;
		this.category = category;
		this.carvalue = carvalue;
		Customer cust=new Customer();
		cust.setId(customer_id);
		customer=cust;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getChassi() {
		return chassi;
	}
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getCarvalue() {
		return carvalue;
	}
	public void setCarvalue(String carvalue) {
		this.carvalue = carvalue;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

}
