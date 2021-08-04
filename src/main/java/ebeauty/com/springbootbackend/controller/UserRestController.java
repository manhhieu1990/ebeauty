package ebeauty.com.springbootbackend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import ebeauty.com.springbootbackend.model.User;
import ebeauty.com.springbootbackend.service.UserService;

@Controller
@RequestMapping(path="/api/v1")
public class UserRestController {

	private UserService userService;
	
	public UserRestController(UserService theUserService) {
		userService = theUserService;
	}
	
	@RequestMapping(value="/users/{id}",method=RequestMethod.GET)
	public User searchUser(@PathVariable Long id) {
		User theUser = userService.findUserById(id);
		return theUser;
	}
	
	
}
