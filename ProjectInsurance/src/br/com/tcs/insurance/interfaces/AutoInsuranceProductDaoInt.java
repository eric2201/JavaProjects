package br.com.tcs.insurance.interfaces;

import java.util.List;

import br.com.tcs.insurance.model.Auto;
import br.com.tcs.insurance.model.AutoInsuranceProduct;

public interface AutoInsuranceProductDaoInt {
	
	public boolean addAutoInsuranceProduct(AutoInsuranceProduct autoInsuranceProduct);
	public boolean removeAutoInsuranceProduct(int id);
	public boolean updateAutoInsuranceProduct(int id, String description);
	public List<AutoInsuranceProduct> listAutoInsuranceProduct();
	
}
