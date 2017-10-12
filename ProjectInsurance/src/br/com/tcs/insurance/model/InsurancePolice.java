package br.com.tcs.insurance.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="Insurance_Police")
public class InsurancePolice {
		@Id
		private int id;
		private Date date;
		@JoinColumn(name="id_auto")
		private Auto auto;
		@JoinColumn(name="id_auto_payment_plain")
		private AutoPaymentPlain autoPaymentPlain;
		@JoinColumn(name="id_insurance_product")
		private AutoInsuranceProduct autoInsuranceProduct;
		@JoinColumn(name="id_insurance_category")
		private InsuranceCategory insuranceCategory;
		
		
		public InsurancePolice(Date date, Auto auto, int id_autoPaymentPlain,
				int id_autoInsuranceProduct, int id_insuranceCategory) {
			
			this.date = date;
			this.auto = auto;
			AutoPaymentPlain autoPaymentPlain = new AutoPaymentPlain();
			autoPaymentPlain.setId(id_autoPaymentPlain);
			this.autoPaymentPlain = autoPaymentPlain;
			AutoInsuranceProduct autoInsuranceProduct = new AutoInsuranceProduct();
			autoInsuranceProduct.setId(id_autoInsuranceProduct);
			this.autoInsuranceProduct = autoInsuranceProduct;
			InsuranceCategory insuranceCategory = new InsuranceCategory();
			insuranceCategory.setId(id_insuranceCategory);
			this.insuranceCategory = insuranceCategory;
		}
		public InsurancePolice() {
			autoPaymentPlain = new AutoPaymentPlain();
			autoInsuranceProduct = new AutoInsuranceProduct();
			insuranceCategory = new InsuranceCategory();
		}
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public Date getDate() {
			return date;
		}
		public void setDate(Date date) {
			this.date = date;
		}
		public Auto getAuto() {
			return auto;
		}
		public void setAuto(Auto auto) {
			this.auto = auto;
		}
		public AutoPaymentPlain getAutoPaymentPlain() {
			return autoPaymentPlain;
		}
		public void setAutoPaymentPlain(AutoPaymentPlain autoPaymentPlain) {
			this.autoPaymentPlain = autoPaymentPlain;
		}
		public AutoInsuranceProduct getAutoInsuranceProduct() {
			return autoInsuranceProduct;
		}
		public void setAutoInsuranceProduct(AutoInsuranceProduct autoInsuranceProduct) {
			this.autoInsuranceProduct = autoInsuranceProduct;
		}
		public InsuranceCategory getInsuranceCategory() {
			return insuranceCategory;
		}
		public void setInsuranceCategory(InsuranceCategory insuranceCategory) {
			this.insuranceCategory = insuranceCategory;
		}
		
		
		
		
}
