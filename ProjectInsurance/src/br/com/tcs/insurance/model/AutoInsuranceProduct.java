package br.com.tcs.insurance.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="auto_insurance_product")
public class AutoInsuranceProduct {
		@Id
		private int id;
		private String name;
		private String description;
		private String coverage;
		private String clauses;
		
		public AutoInsuranceProduct() {
			
		}
		public AutoInsuranceProduct(String name, String description, String coverage, String clauses) {
			
			this.name = name;
			this.description = description;
			this.coverage = coverage;
			this.clauses = clauses;
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
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public String getCoverage() {
			return coverage;
		}
		public void setCoverage(String coverage) {
			this.coverage = coverage;
		}
		public String getClauses() {
			return clauses;
		}
		public void setClauses(String clauses) {
			this.clauses = clauses;
		}
	
}
