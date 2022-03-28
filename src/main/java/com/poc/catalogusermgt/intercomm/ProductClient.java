package com.poc.catalogusermgt.intercomm;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "product-service",url="http://localhost:8088/")
public interface ProductClient {
	@GetMapping("/vendors")
	public ResponseEntity<?> getAllVendors();
}
