package com.example.cartservice.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.cartservice.model.Cart;
import com.example.cartservice.model.Product;

@Service
public class CartDataService {
	static List<Cart> cartList = new ArrayList<>();
	static List<Product> productList1 = new ArrayList<>();
	static List<Product> productList2 = new ArrayList<>();
	static List<Product> productList3 = new ArrayList<>();

	static {
		Product product = new Product("p1", "coffee",
				"great quality coffee beans slowly roasted to achieve perfect coffe flavour", 499);
		Product product2 = new Product("p2", "Olive oil", "olivr oil is obtained by pressing of olives", 10);
		Product product3 = new Product("p3", "Pure Honey", "", 168);
		Product product4 = new Product("p4", "eggless mayo", "made with carefully selected quality ingredients", 155);
		Product product5 = new Product("p5", "journal", "A5 size-easy to carry and handle", 455);
		productList1.add(product);
		productList1.add(product3);
		productList1.add(product4);
		productList1.add(product5);
		productList2.add(product5);
		productList2.add(product3);
		productList3.add(product);
		productList3.add(product4);
		productList3.add(product2);

	}

	static {

		cartList.add(new Cart("c1", "cu1", productList1));
		cartList.add(new Cart("c2", "cu2", productList2));
		cartList.add(new Cart("c3", "cu3", productList3));
		cartList.add(new Cart("c4", "cu4", productList1));

	}

	public Cart getCartDetailsByCustomerId(String id) {

		for (Cart cart : cartList) {
			if (cart.getCustomerId().equalsIgnoreCase(id)) {
				return cart;
			}

		}
		return null;

	}

}
