package br.com.tcs.insurance.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table
public class Customer {
		@Id
		@GeneratedValue
		private int id;
		private String name;
		private String last_name;
		private String nationality;
		private String address;
		private String city;
		private String state;
		private String country;
		private String zip_code;
		
		@OneToMany(mappedBy="customer")
		List<Auto> autos;
		
		public Customer() {
			
		}
		
		public Customer(String name, String last_name, String nationality, String address, String city,
				String state, String country, String zip_code) {
			
			this.name = name;
			this.last_name = last_name;
			this.nationality = nationality;
			this.address = address;
			this.city = city;
			this.state = state;
			this.country = country;
			this.zip_code = zip_code;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getLast_name() {
			return last_name;
		}
		public void setLast_name(String last_name) {
			this.last_name = last_name;
		}
		public String getNationality() {
			return nationality;
		}
		public void setNationality(String nationality) {
			this.nationality = nationality;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			this.country = country;
		}
		public String getZip_code() {
			return zip_code;
		}
		public void setZip_code(String zip_code) {
			this.zip_code = zip_code;
		}
		
		
}
