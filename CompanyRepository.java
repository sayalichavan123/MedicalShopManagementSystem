package com.mydata.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mydata.model.Company;

public interface CompanyRepository extends JpaRepository<Company, Integer>{

}
