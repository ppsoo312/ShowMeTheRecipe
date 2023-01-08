package com.smtr.division;

import java.util.List;

public class DivisionService {

	private DivisionDAO divisionDao;
	
	public void setDivisionDao(DivisionDAO divisionDao) {
		this.divisionDao=divisionDao;
	}
	
	public List<String> ganreList() {
		return divisionDao.ganreList();
	}
	
	public List<String> ingredientList(){
		return divisionDao.ingredientList();
	}
	public List<String> situationList(){
		return divisionDao.situationList();
	}
	public List<String> cookeryList(){
		return divisionDao.cookeryList();
	}
}
