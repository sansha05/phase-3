package com.springjdbc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.springjdbc.dao.EproductDao;
import com.springjdbc.entity.Eproduct;

@Controller
public class ListProduct {
	
	@Autowired
	EproductDao eproducDao;
	
	List<Eproduct> products;
	
	@GetMapping("/products")
	public String getProducts(Model model) {
		products = eproducDao.getProduct();
		model.addAttribute("products", products);
		
		return "products";
	}

}
