package com.mydata.service;

import java.util.List;

import com.mydata.model.Catagory;

public interface CatagoryService {

	List<Catagory> getallcatagory();
	
	Catagory savecatogory(Catagory catagory);
	
	Catagory getCatagory(int id);
	
	void deletecatagoryByid(int id);
	
	Catagory updatecatagory(Catagory catagory);
}
