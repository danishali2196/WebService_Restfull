package com.nt.resource;

import javax.inject.Singleton;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.nt.bind.User;


@Path("/example")
@Singleton
public class RestEasyEx {
	
	
	public RestEasyEx() {
		System.out.println("RestEasyEx.RestEasyEx()");
	}


	
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	public Response postEmp(User user) {
		System.out.println("RestEasyEx.postEmp()");
	
		user.getName();
		user.getEmail();
		
		Response responce = Response.ok("getEmp method is  calles"+user).build();
		return responce;
	}
}
