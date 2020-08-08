package com.boban.ShoppingCart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.boban.ShoppingCart.constants.ViewNameConstants;

@Controller
public class HomeController {
	
	@GetMapping("/home")
	public String home() {
		return ViewNameConstants.ROOT_VIEW;
	}

}
