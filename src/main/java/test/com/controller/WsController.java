package test.com.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import test.com.bean.WiselyMessage;
import test.com.bean.WiselyResponse;

@Controller
public class WsController {

	 @MessageMapping("/welcome")//1
	    @SendTo("/topic/getResponse")//2
	    public WiselyResponse say(WiselyMessage message) throws Exception {
	        return new WiselyResponse("Welcome, " + message.getName() + "!");
	    }

	 @RequestMapping(value="/ws")
	 public String hello(){
		  return "ws";
		
	 }
	 
	 @RequestMapping("/greeting")
	    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
	        System.out.println("name =======>"+name);
		 	model.addAttribute("name", name);
	        return "greeting";
	    }
}
