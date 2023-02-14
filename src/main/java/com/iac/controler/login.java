package com.iac.controler;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class login {
	@GetMapping("/")
	public String mostrarLogin(Model model) {
		System.out.println("login");
		return "login";
	}
}
