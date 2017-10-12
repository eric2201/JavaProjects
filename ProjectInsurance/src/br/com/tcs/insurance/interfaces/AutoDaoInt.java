package br.com.tcs.insurance.interfaces;

import java.util.List;

import br.com.tcs.insurance.model.Auto;

public interface AutoDaoInt {
	
	public boolean addAuto(Auto auto);
	public boolean removeAuto(int id);
	public boolean updateAuto(int id, String carvalue);
	public List<Auto> listAuto();

}
