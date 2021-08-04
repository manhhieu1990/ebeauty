package ebeauty.com.springbootbackend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ebeauty.com.springbootbackend.model.User;

@Controller
public class AppController {

	@RequestMapping("/")
	public String viewHomePage() {
		return "index";
	}
	
	@RequestMapping("/login")
	public String goToLoginPage() {
		return "login";
	}
	
	@RequestMapping("/user-register")
	public String goToUserRegisterPage(Model model) {
		model.addAttribute("user",new User());
		return "signup";
	}
	
	@RequestMapping("/expert-register")
	public String goToExpertRegisterPage() {
		return "expert";
	}
}
