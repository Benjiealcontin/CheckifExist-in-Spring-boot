package com.operation.Controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.operation.Model.lists;
import com.operation.Repository.listsRepo;
import com.operation.Service.Services;

@Controller
public class Rest {

	@Autowired
	private Services service;
	@Autowired
	private listsRepo repo;
	
	@PostMapping("/save")
	public String check(@RequestParam("firstname")String firstname,@RequestParam("lastname")String lastname,lists list,HttpSession session) {	
		List<lists> emps = repo.findByfirstname(firstname);
		if(!(emps.size()>0)) {
			service.adduser(list);
		return "success";
		}
		return "error";
	}
	
	
	
	
	
	
	
	
}
