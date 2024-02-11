package com.mydata.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.mydata.model.Sell;
import com.mydata.service.SellService;

@Controller
public class SellController {
	@Autowired
	private SellService sellService;

	@GetMapping("/sells")
	public String listSell(Model model) {
		List<Sell> sells = sellService.viewallsell();
		model.addAttribute("sells", sells);
		return "sells";
	}

	@GetMapping("/addsell")
	public String createaddsellForm(Model model) {
		Sell sell = new Sell();
		model.addAttribute("sells", sell);
		return "addsell";
	}

	@PostMapping("/savesell")
	public String savesell(@ModelAttribute Sell sell) {
		sellService.savesell(sell);
		return "redirect:/sells";
	}

	@GetMapping("/sells/{id}")
	public String deleteSellbyid(@PathVariable int id) {
		sellService.deleteSellbyid(id);
		return "redirect:/sells";

	}

	@GetMapping("/sells/edit/{id}")
	public String getupdatesellform(@PathVariable int id, Model model) {
		Sell Sellbyid = sellService.getsellbyid(id);
		model.addAttribute("S", Sellbyid);
		return "updatesell.html";

	}

	@PostMapping("/sells/{id}")
	public String updatesellbyid(@PathVariable int id, @ModelAttribute("S") Sell sell, Model model) {
		Sell existingSell = sellService.getsellbyid(id);
		existingSell.setId(id);
		existingSell.setCost(sell.getCost());
		existingSell.setCustomername(sell.getCustomername());
		existingSell.setDate(sell.getDate());
		existingSell.setMedicinename(sell.getMedicinename());
		existingSell.setMobileno(sell.getMobileno());
		existingSell.setQuantity(sell.getQuantity());
		existingSell.setTotal(sell.getCost() * sell.getQuantity()); 
		sellService.updatesellbyid(existingSell);
		return "redirect:/sells";
	}
}