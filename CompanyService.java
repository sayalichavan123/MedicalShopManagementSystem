package com.mydata.service;

import java.util.List;

import com.mydata.model.Company;

public interface CompanyService {

	public List<Company> getAllCompany();
	
	Company savecompany(Company company);
	
	Company getcompanybyid(int id);
	
	void deleteCompanybyid(int id); 
	
	Company updateCompany(Company company);
}
