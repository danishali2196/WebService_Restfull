package com.nt.resource;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.nt.bind.User;

@Path("/example")
public class RestEasyEx{
	
	public RestEasyEx() {
		System.out.println("RestEasyEx.RestEasyEx()");
	}


	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public Response getEmp() {
		System.out.println("RestEasyEx.getEmp()");
		User user = new User();
		user.setName("danish");
		user.setEmail("danish@gmail.com");
		Response responce = Response.ok("getEmp method is  calles"+user).build();
		return responce;
	}
}
