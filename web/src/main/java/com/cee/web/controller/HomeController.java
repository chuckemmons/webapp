/**
 *
 */
package com.cee.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author chuck
 *
 */
@Controller
public class HomeController {
	@RequestMapping("/")
	public String home(@RequestParam(value = "name", required = false, defaultValue = "World") String name,
			Model model) {
		model.addAttribute("name", name);
		return "home";
	}

	@RequestMapping("/todo")
	public String todo(Model model) {
		return "todo";
	}

	@RequestMapping("/about")
	public String about(Model model) {
		return "about";
	}

	@RequestMapping("/contact")
	public String contact(Model model) {
		return "contact";
	}

	@RequestMapping("/signin")
	public String signin(Model model) {
		return "signin";
	}
}
