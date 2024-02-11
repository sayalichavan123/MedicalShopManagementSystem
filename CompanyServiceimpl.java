package com.mydata.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mydata.Repository.CompanyRepository;
import com.mydata.model.Company;

@Service
public class CompanyServiceimpl implements CompanyService {
	@Autowired
	private CompanyRepository companyRepository;

	@Override
	public Company savecompany(Company company) {
		return companyRepository.save(company);
	}

	@Override
	public List<Company> getAllCompany() {
		return companyRepository.findAll();
	}

	@Override
	public Company getcompanybyid(int id) {
		return companyRepository.findById(id).get();
	}

	@Override
	public void deleteCompanybyid(int id) {
		companyRepository.deleteById(id);
	}

	@Override
	public Company updateCompany(Company company) {
		return companyRepository.save(company);
	}

}
