package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class SimpleInterestController {

	@RequestMapping(method = RequestMethod.GET)
    public String index(){
        System.out.println("This is home");
        return "simpleInterest";
    }
	
	@RequestMapping(path="/processform",method = RequestMethod.POST)
	public String handleForm(@RequestParam("amount") double amount,
			@RequestParam("rate") double rate,
			@RequestParam("time") int time, Model model) {
		
		double interest=(amount*rate*time)/100;
		System.out.println("Simple Interest is = "+interest);
		model.addAttribute("interest", interest);
		return "success";
	}
	
}
