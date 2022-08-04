package com.operation.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Controllers {

	@RequestMapping("/")
	public ModelAndView home() {
		return new ModelAndView("index");
		
	}
	@RequestMapping("/success")
	public ModelAndView fhome() {
		return new ModelAndView("success");
		
	}
	@RequestMapping("/already")
	public ModelAndView lhome() {
		return new ModelAndView("error");
		
	}
}
