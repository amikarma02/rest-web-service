package com.sapient.trg.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sapient.trg.bean.Employee;



public class EmployeeDAO implements IEmployeeDAO{
	private static final Map<Integer, Employee> empMap = new HashMap<Integer, Employee>();
	 
    static {
        initEmps();
    }
 
    private static void initEmps() {
        Employee emp1 = new Employee(1001, "Smith", new Date(),"Java Developer",3456.0,10);
        Employee emp2 = new Employee(1002, "Clarke", new Date(),"Clerk",1455.0,10);
        Employee emp3 = new Employee(1003, "Jones", new Date(),"Manager",4450.0,20);
        Employee emp4 = new Employee(1004, "Kumar", new Date(),"Developer",2450.0,20);
 
        empMap.put(emp1.getEmpno(), emp1);
        empMap.put(emp2.getEmpno(), emp2);
        empMap.put(emp3.getEmpno(), emp3);
        empMap.put(emp4.getEmpno(), emp4);
    }

	@Override
	public Employee getEmployee(Integer empno) {
		return empMap.get(empno);
	}

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> empList= new ArrayList<>(empMap.values());
		return empList;
	}

	@Override
	public Employee addEmployee(Employee employee) {
		if(employee.getEmpno() !=null) {
			empMap.put(employee.getEmpno(), employee);
			return employee;
		}else {
			return null;
		}
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		if(employee.getEmpno() !=null) {
			empMap.put(employee.getEmpno(), employee);
			return employee;
		}else {
			return null;
		}
	}

	@Override
	public Boolean deleteEmployee(Integer empno) {
		Employee employee=empMap.remove(empno);
		if(employee !=null) {
			return true;
		}else {
			return false;
		}
	}

}
