package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.Entity.UserList;
import com.example.demo.Service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;

//
	

	@GetMapping("/list")
	public String findUser(Model model) {
		model.addAttribute("UserList", userService.findUser());
		return "userlist";
	}
	
	@PostMapping("/useredit")
	public String editUser(@ModelAttribute("editUser") UserList userList) {
		System.out.println("edit" + userList.getPass());
		userService.editUser(userList);
		return "redirect:/user/list";
	}


}
