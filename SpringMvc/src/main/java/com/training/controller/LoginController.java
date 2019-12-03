package com.training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.training.service.LoginService;

@Controller
public class LoginController {
	@Autowired
	private LoginService loginService;
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
@RequestMapping(value="/Validate")
public ModelandView ValidateUser(@RequestParam("uname") String uname, @RequestParam("upass") String upass)
{
boolean ans=loginService.validateUser(uname,upass);
if(ans) {
	return new ModelandView("Welcome","uname",uname);
}
else {
	return new ModelandView("redirect:/");
}
}

}
