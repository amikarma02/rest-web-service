package com.sapient.trg.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
/**
 * 
 * 
 * @author Admin
 *	1. http://localhost:8081/rest-web-service/rest/hello
 *	2. http://localhost:8081/rest-web-service/rest/hello/hi
 *
 *	The above URIs are called API end-points. Consumers/client applications
 *  will use the above uri to consume the data.
 */
@Path("/hello")
public class HelloController {
	//http://localhost:8081/rest-web-service/rest/hello
	@GET
	public String sayHello() {
		return "Hello World";
	}
	
	
	//http://localhost:8081/rest-web-service/rest/hello/hi
	@GET
	@Path("/hi")
	public Response sayyHi() {
		return Response.ok().entity("Service online").build();
	}
	
}
