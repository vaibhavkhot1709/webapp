package com.webapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webapp.dao.EmpDao;
import com.webapp.model.Employee;

@Service
public class EmpServiceImpl implements EmpService {

	@Autowired
	EmpDao empDao;

	public void createEmployee(Employee employee) {
		
		System.out.println("inside EmpService Impl");
		empDao.createEmployee(employee);
		
	}

	public void deleteEmployee(int id) {
		empDao.deleteEmployee(id);
		
	}
	
	
}
