package com.mydata.service;

import java.util.List;

import com.mydata.model.Sell;

public interface SellService {

	public List<Sell> viewallsell();
	
	Sell savesell(Sell sell);
	
	Sell getsellbyid(int id);
	
	public void deleteSellbyid(int id);
	
	Sell updatesellbyid(Sell sell);
}
