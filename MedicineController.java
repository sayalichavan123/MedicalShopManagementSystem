package com.mydata.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.mydata.model.Medicine;
import com.mydata.service.MedicineService;

@Controller
public class MedicineController {
	@Autowired
	MedicineService medicineService;

	@GetMapping("/medicines")
	public String listmedicine(Model model) {
		List<Medicine> medicinelist = medicineService.getAllMedicine();
		model.addAttribute("Medicines", medicinelist);
		return "medicines";

	}

	@GetMapping("/addmedicine")
	public String createAddMedicineForm(Model model) {
		Medicine m = new Medicine();
		model.addAttribute("medicine", m);
		return "addmedicine";
	}

	@PostMapping("/savemedicine")
	public String saveMedicine(@ModelAttribute Medicine medicine, Model model) {
		medicineService.savemedicine(medicine);
		model.addAttribute("successMessage", "Medicine added successfully!");
		return "home";
	}

	@GetMapping("/medicines/edit/{id}")
	public String ShoweditmedicineForm(@PathVariable int id, Model model) {
		Medicine medicinebyid = medicineService.getmedicineByid(id);
		model.addAttribute("medicine", medicinebyid);
		return "editmedicine.html";

	}

	@PostMapping("/medicines/{id}")
	public String updateMedicine(@PathVariable int id, @ModelAttribute("medicine") Medicine medicine, Model model) {
		Medicine existingMedicine = medicineService.getmedicineByid(id);
		existingMedicine.setMedicineName(medicine.getMedicineName());
		existingMedicine.setMedicinetype(medicine.getMedicinetype());
		existingMedicine.setMfgdate(medicine.getMfgdate());
		existingMedicine.setExpirydate(medicine.getExpirydate());
		existingMedicine.setCost(medicine.getCost());
		existingMedicine.setCompanyName(medicine.getCompanyName());

		medicineService.updatemedicine(existingMedicine);

		model.addAttribute("successMessage", "Medicine updated successfully!");
		return "home";
	}

	@GetMapping("/medicines/{id}")
	public String deleteMedicine(@PathVariable int id) {
		medicineService.deleteMEdicinebyid(id);
		return "redirect:/medicines";

	}
}
