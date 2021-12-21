package org.springframework.samples.petclinic.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/product")
public class ProductController {
    
	@Autowired
	private ProductService ps;
	
	@GetMapping(value = "/create")
	public String initCreationForm(ModelMap model) {
		Product p = new Product();
		model.put("product", p);
		return "product/create";
	}
}