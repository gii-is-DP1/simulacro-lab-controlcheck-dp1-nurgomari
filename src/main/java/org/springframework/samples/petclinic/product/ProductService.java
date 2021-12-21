package org.springframework.samples.petclinic.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	@Autowired
	ProductRepository pr;
	
    public List<Product> getAllProducts(){
        return pr.findAll();
    }

    public List<Product> getProductsCheaperThan(double price) {
        return pr.getProductsCheaperThan(price);
    }

    public ProductType getProductType(String typeName) {
        return pr.getProductType(typeName);
    }

    public Product save(Product p){
        return null;       
    }

    
}
