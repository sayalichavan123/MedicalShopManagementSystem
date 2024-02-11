package com.mydata.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mydata.model.Medicine;

public interface MedicineRepository  extends JpaRepository<Medicine, Integer>{

}
