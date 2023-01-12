package com.webapp.dao;

import java.util.List;

import com.webapp.model.Employee;

public interface EmpDao {

	public void createEmployee(Employee employee);

	public void deleteEmployee(int id);

	public void updateEmp(int id);

	public Employee getById(int id);

	List<Employee> showEmployee();
}
