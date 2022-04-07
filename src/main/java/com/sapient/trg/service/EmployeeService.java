package com.sapient.trg.service;

import java.util.List;

import com.sapient.trg.bean.Employee;
import com.sapient.trg.dao.EmployeeDAO;
import com.sapient.trg.dao.IEmployeeDAO;


public class EmployeeService implements IEmployeeService {
	IEmployeeDAO employeeDAO=new EmployeeDAO();

	@Override
	public Employee getEmployee(Integer empno) {
		return employeeDAO.getEmployee(empno);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeDAO.getAllEmployees();
	}

	@Override
	public Employee addEmployee(Employee employee) {
		return employeeDAO.addEmployee(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		return employeeDAO.updateEmployee(employee);
	}

	@Override
	public Boolean deleteEmployee(Integer empno) {
		return employeeDAO.deleteEmployee(empno);
	}
	
	
}
