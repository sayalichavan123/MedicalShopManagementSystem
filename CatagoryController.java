package com.mydata.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.mydata.model.Catagory;
import com.mydata.service.CatagoryService;

@Controller
public class CatagoryController {

	@Autowired
	private CatagoryService catagoryService;

	@GetMapping("/catagories")
	public String listofallcatagory(Model model) {
		List<Catagory> clist = catagoryService.getallcatagory();
		model.addAttribute("catagories", clist);
		return "catagories";
	}

	@GetMapping("/addcatagory")
	public String openAddCatagoryForm(Model model) {
		Catagory c = new Catagory();
		model.addAttribute("catagory", c);
		return "addcatogory.html";
	}

	@PostMapping("/savecatagory")
	public String saveCatogory(@ModelAttribute Catagory catagory) {
		catagoryService.savecatogory(catagory);
		return "redirect:/catagories";
	}

	@GetMapping("/catagories/{id}")
	public String deleteproductbyid(@PathVariable int id) {
		catagoryService.deletecatagoryByid(id);
		return "redirect:/catagories";

	}

	 @GetMapping("/catagories/update/{id}")
	    public String showupdateCatagoryForm(@PathVariable int id, Model model) {
	        Catagory catagorybyid = catagoryService.getCatagory(id);
	        model.addAttribute("catagory", catagorybyid);
	        return "updatecatagory";
	    }

	    @PostMapping("/catagories/update/{id}")
	    public String updateCatagory(@PathVariable int id, @ModelAttribute("catagory") Catagory catagory, Model model) {
	        Catagory existingcatagory = catagoryService.getCatagory(id);

	        existingcatagory.setCatogoryname(catagory.getCatogoryname());
	        existingcatagory.setDescription(catagory.getDescription());

	        catagoryService.updatecatagory(existingcatagory);
	        return "redirect:/catagories";
	    }
	}