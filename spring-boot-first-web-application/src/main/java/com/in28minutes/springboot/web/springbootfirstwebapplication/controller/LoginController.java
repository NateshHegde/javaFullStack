package com.in28minutes.springboot.web.springbootfirstwebapplication.controller;

import javax.xml.ws.RequestWrapper;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class LoginController {

	
	@RequestMapping("/login")
	@ResponseBody
	public String loginMessage(){
		return "Hello world";
	}
}
