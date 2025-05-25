package com.avishJava.firstWebApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {

	//say-heelo=> "what are you lesrning today"
	
	@RequestMapping("say-hello")
	@ResponseBody
	public String sayHello() {
		return "<!DOCTYPE html>\r\n"
				+ "<html>\r\n"
				+ "<head>\r\n"
				+ "    <title>My First Page</title>\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "    <h1>Welcome to My Website</h1>\r\n"
				+ "    <p>This is a simple HTML page.</p>\r\n"
				+ "</body>\r\n"
				+ "</html>\r\n"
				+ "";
		
	}
	
	//"say-hello-jsp"
	//src/main/resources/META-INF/resources/WEB-INF/jsp/sayHello.jsp
	@RequestMapping("say-hello-jsp")
	public String sayHelloJSP() {
		return "sayHello";
	}
}
