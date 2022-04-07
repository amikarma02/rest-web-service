package com.sapient.trg.dao;

import java.util.List;

import com.sapient.trg.bean.Employee;

public interface IEmployeeDAO {
	public Employee getEmployee(Integer empno);
	public List<Employee> getAllEmployees();
	public Employee addEmployee(Employee employee);
	public Employee updateEmployee(Employee employee);
	public Boolean deleteEmployee(Integer empno);
}
