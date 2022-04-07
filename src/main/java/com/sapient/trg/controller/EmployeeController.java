package com.sapient.trg.controller;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.sapient.trg.bean.Employee;
import com.sapient.trg.service.EmployeeService;
import com.sapient.trg.service.IEmployeeService;

@Path("/employees")
public class EmployeeController {
	
	IEmployeeService service=new EmployeeService();
 
    // URI:
    // http://localhost:8081/rest-web-service/rest/employees/xml
    @GET
    @Produces(MediaType.APPLICATION_XML)
    @Path("/xml")
    public Response getEmployeesAsXml() {
        List<Employee> employeeList = service.getAllEmployees();
        GenericEntity<List<Employee>> empList= 
        		new GenericEntity<List<Employee>>(employeeList) {};
        return Response.ok(empList).build();
    }
    
    
 // URI:
    // http://localhost:8081/rest-web-service/rest/employees/json
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/json")
    public Response getEmployeesAsJson() {
        List<Employee> employeeList = service.getAllEmployees();       
        return Response.ok(employeeList).build();
    }
    
    
    
 
    // URI:
    // http://localhost:8081/rest-web-service/rest/employees/1001
    @GET
    @Path("/{empno}")
//    @Produces(MediaType.APPLICATION_XML)
    @Produces(MediaType.APPLICATION_JSON)
    public Employee getEmployee(@PathParam("empno") Integer empno) {
        return service.getEmployee(empno);
    }
 
    // URI:
    // /contextPath/servletPath/employees
    @POST
    //@Produces(MediaType.APPLICATION_XML)
    @Produces(MediaType.APPLICATION_JSON)
    public Employee addEmployee(Employee emp) {
        return service.addEmployee(emp);
    }
 
    // URI:
    // /contextPath/servletPath/employees
    @PUT
    //@Produces(MediaType.APPLICATION_XML)
    @Produces(MediaType.APPLICATION_JSON)
    public Employee updateEmployee(Employee emp) {
        return service.updateEmployee(emp);
    }
 
    @DELETE
    @Path("/{empno}")
    //@Produces(MediaType.APPLICATION_XML)
    @Produces(MediaType.APPLICATION_JSON)
    public void deleteEmployee(@PathParam("empno") Integer empno) {
        service.deleteEmployee(empno);
    }
    
 
}
