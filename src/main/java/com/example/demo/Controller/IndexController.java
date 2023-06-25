package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.Service.BookService;
import com.example.demo.Service.auth.CustomDetails;

@Controller
public class IndexController {
	@Autowired
	BookService bookService;

	@GetMapping
	public String index(@AuthenticationPrincipal CustomDetails user_role, Model model) {
		//model.addAttribute("BookList", bookService.findBook());
		return "booklist";
	}

	@GetMapping("login")
	public String showLoginForm() {
		return "login";
	}

	@GetMapping("logout")
	public String showLogoutForm() {
		return "logout";
	}
}


