package com.guru.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class VendorRestConsumer {
	@Autowired
	private LoadBalancerClient client;
	
	public String getVendorData() {
		//get one ServiceIntsnace based on ServiceId
		ServiceInstance si = client.choose("VENDOR-SERVICE");
		
		//read URI and add path
		String url = si.getUri() + "/vendor/info";
		
		//create RestTemplate object
		RestTemplate rt = new RestTemplate();
		
		//make HTTP call
		String response = rt.getForObject(url, String.class);
		
		return response;
	}
}
