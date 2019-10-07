package com.nt.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.nt.bind.User;


@Path("/example")
public class RestEasyEx {
	
	
	public RestEasyEx() {
		System.out.println("RestEasyEx.RestEasyEx()");
	}


	
	@POST
	@Consumes(MediaType.TEXT_PLAIN)
	public Response getEmp() {
		System.out.println("RestEasyEx.getEmp()");
		User user = new User();
		user.setName("danish");
		user.setEmail("danish@gmail.com");
		Response responce = Response.ok("getEmp method is  calles"+user).build();
		return responce;
	}
}
