package com.guru.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.guru.consumer.VendorRestConsumer;

@RestController
@RequestMapping("/prod")
public class ProductRestController {
	
	@Autowired
	private VendorRestConsumer consumer;
	
	@GetMapping("/info")
	public String info() {
		return "FROM PRODUCT EUREKA SERVICE" ;
	}
	
	@GetMapping("/msg")
	public String getData() {
		return "FROM PRODUCT =>" + consumer.getVendorData();
	}
}