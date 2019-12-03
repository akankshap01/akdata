package com.training.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyFirstController {
	
	@RequestMapping(value="/hello", method=RequestMethod.GET)
	public ModelAndView sayHello() {
		String msg="Hello World!";
		return new ModelAndView("showmsg","msg",msg);
	}

}
