package com.webapp.dao;

import com.webapp.model.Employee;

public interface EmpDao {

	public void createEmployee(Employee employee);

	public void deleteEmployee(int id);
}
