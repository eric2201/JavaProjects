package br.com.tcs.insurance.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Auto_Payment_Plain")
public class AutoPaymentPlain {
		@Id
		private int id;
		private String period;
		private String total_amount;
		private Date start_date;
		public int getId() {
			return id;
		}
		public AutoPaymentPlain() {
			
		}
		public AutoPaymentPlain(String period, String total_amount, Date start_date) {
	
		
			this.period = period;
			this.total_amount = total_amount;
			this.start_date = start_date;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getPeriod() {
			return period;
		}
		public void setPeriod(String period) {
			this.period = period;
		}
		public String getTotal_amount() {
			return total_amount;
		}
		public void setTotal_amount(String total_amount) {
			this.total_amount = total_amount;
		}
		public Date getStart_date() {
			return start_date;
		}
		public void setStart_date(Date start_date) {
			this.start_date = start_date;
		}
	
}
