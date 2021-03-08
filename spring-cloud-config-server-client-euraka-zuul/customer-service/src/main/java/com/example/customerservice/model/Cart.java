package com.example.customerservice.model;

import java.util.ArrayList;
import java.util.List;

public class Cart {
	
private String cartId;
private String customerId;
private  List<Product> productList = new ArrayList<>();
public Cart() {
	super();
}
public Cart(String cartId, String customerId, List<Product> productList) {
	super();
	this.cartId = cartId;
	this.customerId = customerId;
	this.productList = productList;
}
public String getCartId() {
	return cartId;
}
public void setCartId(String cartId) {
	this.cartId = cartId;
}
public String getCustomerId() {
	return customerId;
}
public void setCustomerId(String customerId) {
	this.customerId = customerId;
}
public List<Product> getProductList() {
	return productList;
}
public void setProductList(List<Product> productList) {
	this.productList = productList;
}



	
	
	

}
