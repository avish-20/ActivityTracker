package com.avishJava.firstWebApp.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("UserName")
public class LoginController {
	@Autowired
	private AuthenticationService authenticationService;
	public Logger logger = LoggerFactory.getLogger(getClass());
	//models is used to passs value from url to js[
	
//	public String gotoLoginPage(@RequestParam String name, ModelMap model) {
//		model.put("name", name);
//		
//		logger.debug("name is {}",name);
//		logger.info("name is {}",name);
//		logger.warn("name is {}",name);
//		System.out.println("welcome"+name);
//		return "login";
//		
//	}
	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String gotoLoginPage() {
		
		return "login";
		
	} 
	
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String processLogin(@RequestParam String Name,
	                           @RequestParam String Password,
	                           ModelMap model) {
	    System.out.println("POST called with Name: " + Name + " and Password: " + Password);
	    model.put("Username", Name);
	    model.put("Pass", Password);
	    
	    //Authentication
	    
	    model.put("Error", "Invalid Credential plz enter again");
	    if(authenticationService.authenticate(Name, Password)) return "welcome";
	    return "login";
	}

}
