package com.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.webapp.model.Employee;
import com.webapp.service.EmpService;

@Controller
public class EmpController {
	
	@Autowired
	EmpService empService;
	
	@RequestMapping(value = "/createNewEmp", method = RequestMethod.POST)
	public String createEmployee(Employee employee) {
		
		System.out.println("EmpController ");
		
		empService.createEmployee(employee);
		
		return "employeeView";
	}
	
	@RequestMapping(value = "/deleteEmployee", method = RequestMethod.POST)
	public String deleteEmployee(@ModelAttribute("id") int id) {
		
		System.out.println("EmpController ");
		
		empService.deleteEmployee(id);
		
		return "deleteEmp";
	}

}
