package com.webapp.service;

import com.webapp.model.Employee;

public interface EmpService {

	public void createEmployee(Employee employee);

	public void deleteEmployee(int id);

	public void updateEmp(int id);

	public Employee getById(int id);
		
}
