package com.mydata.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.mydata.model.Company;
import com.mydata.service.CompanyService;

@Controller
public class CompanyController {
	@Autowired
	private CompanyService companyService;

	@GetMapping("/companies")
	public String listCompany(Model model) {
		List<Company> companyList = companyService.getAllCompany();
		model.addAttribute("companies", companyList);
		return "companys.html";
	}

	@PostMapping("/savecompany")
	public String saveCompany(@ModelAttribute Company company) {
		companyService.savecompany(company);
		return "redirect:/companies";
	}

	@GetMapping("/addcompany")
	public String showAddCompanyForm(Model model) {
		Company company = new Company();
		model.addAttribute("Company", company);
		return "addcompany.html";
	}

	@GetMapping("/companies/{id}")
	public String deleteCompany(@PathVariable("id") int id) {
		companyService.deleteCompanybyid(id);
		return "redirect:/companies";

	}

	@GetMapping("/companies/update/{id}")
    public String showUpdateCompanyForm(@PathVariable int id, Model model) {
        Company company = companyService.getcompanybyid(id);
        model.addAttribute("company", company);
        return "updatecompany.html";
	}
	  @PostMapping("/companies/update/{id}")
	    public String updateCompany(@PathVariable int id, @ModelAttribute("company") Company company) {
	        Company existingCompany = companyService.getcompanybyid(id);
	            existingCompany.setCompanyName(company.getCompanyName());
	            existingCompany.setDescription(company.getDescription());
	            companyService.updateCompany(existingCompany);
	        return "redirect:/companies";
	    }
	}