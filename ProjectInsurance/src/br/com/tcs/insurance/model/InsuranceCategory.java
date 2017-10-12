package br.com.tcs.insurance.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Insurance_Category")
public class InsuranceCategory {

		@Id
		private int id;
		private String name;
		private String category;
		public InsuranceCategory() {
			
		}
		public InsuranceCategory(String name, String category) {
			
			
			this.name = name;
			this.category = category;
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
		public String getCategory() {
			return category;
		}
		public void setCategory(String category) {
			this.category = category;
		}
}
