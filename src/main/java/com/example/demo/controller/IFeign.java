package com.example.demo.controller;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("eurekaClient")
public interface IFeign {

//	@GetMapping("/consumer")
	@RequestMapping(value="/all",method={RequestMethod.GET})
//	@PostMapping("/consumer")
	String all();
}
