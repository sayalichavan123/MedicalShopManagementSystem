package com.mydata.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.mydata.model.Product;
import com.mydata.service.ProductService;

@Controller
public class ProductController {
	@Autowired
	private ProductService productService;

	@GetMapping("/products")
	public String listProduct(Model model) {
		List<Product> plist=productService.viewallProduct();
		model.addAttribute("products", plist);
		return "products.html";

	}

	@GetMapping("/addproduct")
	public String showaddproductForm(Model model) {
		Product p = new Product();
		model.addAttribute("products", p);
		return "addproduct";

	}

	@PostMapping("/saveproduct")
	public String saveProduct(@ModelAttribute Product product) {
		productService.saveproduct(product);
		return "redirect:/products";

	}
	@GetMapping("/products/{id}")
	public String deleteProductByid(@PathVariable int id) {
		productService.deleteproductbyid(id);
		return "redirect:/products" ;
		
	}
	 @GetMapping("/products/update/{id}")
	    public String openupdateProductform(@PathVariable int id, Model model) {
	        Product pbyid = productService.getproductbyid(id);
	        model.addAttribute("product", pbyid);
	        return "updateproduct";
	    }

	    @PostMapping("/products/{id}")
	    public String updateProduct(@PathVariable int id, @ModelAttribute Product product) {
	        Product existingProduct = productService.getproductbyid(id);
	        existingProduct.setProducttype(product.getProducttype());
	        existingProduct.setCode(product.getCode());
	        existingProduct.setTotal_stock(product.getTotal_stock());
	        existingProduct.setCompanyname(product.getCompanyname());
	        existingProduct.setCost(product.getCost());
	        existingProduct.setMfgdate(product.getMfgdate());
	        existingProduct.setExpirydate(product.getExpirydate());
	        existingProduct.setDescription(product.getDescription());

	        productService.updateproduct(existingProduct);
	        return "redirect:/products";
	    }
	}