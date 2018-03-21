package com.springboot.first.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class firstController {
	@RequestMapping("/hello")
		public String sayhello() {
			return "HELLO FROM SPRING BOOT!";
		}
}
