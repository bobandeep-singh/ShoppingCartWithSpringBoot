package com.boban.ShoppingCart.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.boban.ShoppingCart.models.data.Page;
import com.boban.ShoppingCart.models.data.PageRepository;

@Controller
@RequestMapping("/admin/pages")
public class AdminPagesController {

	private PageRepository pageRepository;

	public AdminPagesController(PageRepository pageRepository) {
		this.pageRepository = pageRepository;
	}

	@GetMapping
	public String index(Model model) {

		List<Page> pages = pageRepository.findAll();
		model.addAttribute("pages", pages);
		return "admin/pages/index"; // this is the path to the index.html file in resources
	}

	@GetMapping("/add")
	public String addPage(@ModelAttribute Page page) {

		
		System.out.println("UITGKLKHILU");
		// model.addAttribute("page", new Page()); //// and Model model in the method args
		return "admin/pages/add";
	}

}
