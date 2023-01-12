package com.webapp.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

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

		empService.deleteEmployee(id);

		return "deleteEmp";
	}

	@RequestMapping(value = "/updateEmp", method= RequestMethod.POST)
	public String updateEmp(Employee employee) {

		empService.updateEmp(employee);
		return "update";
	}
	
	@RequestMapping(value = "/getEmp", method = RequestMethod.GET)
	public ModelAndView getById(@PathParam("id") int id) {
		ModelAndView mv=new  ModelAndView();
		
		Employee e=empService.getById(id);
		
		mv.addObject(e);
		mv.setViewName("get");
		return mv;
	}

}
