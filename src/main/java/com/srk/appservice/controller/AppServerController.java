package com.srk.appservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class AppServerController {


	@RequestMapping(path = "/appserver")
	public String getAppPage()
	{
		return "login.html";
	}
	
}
