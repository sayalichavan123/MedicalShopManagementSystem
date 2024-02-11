package com.mydata.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mydata.Repository.SellRepository;
import com.mydata.model.Sell;

@Service
public class SellServiceimpl implements SellService {
	@Autowired
	private SellRepository sellRepository;

	@Override
	public List<Sell> viewallsell() {
		return sellRepository.findAll();
	}

	@Override
	public Sell savesell(Sell sell) {
		return sellRepository.save(sell);
	}

	@Override
	public Sell getsellbyid(int id) {
		return sellRepository.findById(id).get();
	}

	@Override
	public void deleteSellbyid(int id) {
		sellRepository.deleteById(id);
	}

	@Override
	public Sell updatesellbyid(Sell sell) {
		return sellRepository.save(sell);
	}

	

	}


