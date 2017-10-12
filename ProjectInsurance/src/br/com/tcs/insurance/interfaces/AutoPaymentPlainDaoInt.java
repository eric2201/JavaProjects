package br.com.tcs.insurance.interfaces;

import br.com.tcs.insurance.model.AutoPaymentPlain;

public interface AutoPaymentPlainDaoInt {

	public boolean addAutoPaymentPlain(AutoPaymentPlain autoPaymentPlain);
	public boolean removeAutoPaymentPlain(int id);
	public boolean updateAutoPaymentPlain(int id);
}
