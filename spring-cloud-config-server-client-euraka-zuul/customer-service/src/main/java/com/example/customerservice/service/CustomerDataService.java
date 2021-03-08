package com.example.customerservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.customerservice.model.Cart;

@Service
public class CustomerDataService {

	@Autowired
	RestTemplate restTemplate;

	public Cart getCartData(String Custid) {

		Cart response = restTemplate.exchange("http://netflix-zuul-api-gateway-server/cart-service/cart/customer/{Custid}", HttpMethod.GET, null,
				new ParameterizedTypeReference<Cart>() {
				}, Custid).getBody();

		return response;

	}

	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
