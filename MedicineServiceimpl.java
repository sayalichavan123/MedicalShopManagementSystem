package com.mydata.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mydata.Repository.MedicineRepository;
import com.mydata.model.Medicine;


@Service
public class MedicineServiceimpl implements MedicineService {
	@Autowired
	private MedicineRepository medicineRepository;

	@Override
	public List<Medicine>getAllMedicine() {
		return medicineRepository.findAll();
	}

	@Override
	public Medicine savemedicine(Medicine medicine) {
		return medicineRepository.save(medicine);
	}

	@Override
	public Medicine updatemedicine(Medicine medicine) {
		return medicineRepository.save(medicine);
	}

	@Override
	public Medicine getmedicineByid(int id) {
		return medicineRepository.findById(id).get();
	}

	@Override
	public void deleteMEdicinebyid(int id) {
		medicineRepository.deleteById(id);
	}

	

	
}
