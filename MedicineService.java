package com.mydata.service;

import java.util.List;

import com.mydata.model.Medicine;

public interface MedicineService {

	public List<Medicine>getAllMedicine();
	
	Medicine savemedicine(Medicine medicine);
	
	Medicine getmedicineByid(int id);
	
	Medicine updatemedicine(Medicine medicine);
	
	void deleteMEdicinebyid(int id);
	
}
