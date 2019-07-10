package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.controller.IFeign;

@RestController
public class ClientConsumerController {
	
	@Autowired
	IFeign iFeign;

	@GetMapping("/consumer")
	public String dc() {
		// 发起REST请求
		return iFeign.all();
	}
	
}
