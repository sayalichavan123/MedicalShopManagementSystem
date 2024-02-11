package com.mydata.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mydata.Repository.CatagoryRepository;
import com.mydata.model.Catagory;

@Service
public class Catagoryserviceimpl implements CatagoryService {
	@Autowired
	CatagoryRepository catagoryRepository;

	@Override
	public List<Catagory> getallcatagory() {
		return catagoryRepository.findAll();
	}

	@Override
	public Catagory savecatogory(Catagory catagory) {
		return catagoryRepository.save(catagory);
	}

	@Override
	public Catagory getCatagory(int id) {
		return catagoryRepository.findById(id).get();
	}

	@Override
	public void deletecatagoryByid(int id) {
		catagoryRepository.deleteById(id);
	}

	@Override
	public Catagory updatecatagory(Catagory catagory) {
		return catagoryRepository.save(catagory);
	}

}
