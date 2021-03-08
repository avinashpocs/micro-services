package com.example.customerservice.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.customerservice.exception.UserNotFoundException;
import com.example.customerservice.model.Cart;
import com.example.customerservice.service.CustomerDataService;

@RestController
public class CustomerController {

	@Autowired
	CustomerDataService customerDataService;

	@GetMapping("/getCustomerCartDetails/{custId}")
	public Cart getCustomerCartDetails(@PathVariable String custId) {		
		
		Optional<Cart> cart = Optional.ofNullable(customerDataService.getCartData(custId)); 
		if(cart.isPresent()){ 
			cart.get();
		}    
		throw new UserNotFoundException("not found customer with id-" + custId);
	}

}
