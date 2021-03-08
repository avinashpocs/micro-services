package com.example.cartservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.cartservice.model.Cart;
import com.example.cartservice.service.CartDataService;

@RestController
public class CartController {

	@Autowired
	CartDataService cartDataService;

	@GetMapping("/cart/customer/{id}")
	public Cart getStudentById(@PathVariable("id") String id) {

		Cart cart = cartDataService.getCartDetailsByCustomerId(id);
		if (cart == null) {
			return null;
		}
		return cart;
		
		
		
		  
		
	}

}
