package com.webapp.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.webapp.model.Employee;

@Repository
public class EmpDaoImpl implements EmpDao{

	@Autowired
	SessionFactory sessionFactory;
	
	public void createEmployee(Employee employee) {
		System.out.println("inside EmpDaoImpl createEmployee() : >>>");
		
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		
		
		session.save(employee);
		tx.commit();
	}

	public void deleteEmployee(int id) {
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		
		
		Employee employee = session.get(Employee.class,id);
		session.delete(employee);
		tx.commit();
	}

}
