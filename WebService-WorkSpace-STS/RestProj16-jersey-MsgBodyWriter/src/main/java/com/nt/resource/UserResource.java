package com.nt.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.nt.bind.User;

@Path("/example")
public class UserResource {

	public UserResource() {
		System.out.println("UserResource.UserResource()");
	}
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public Response getUser() {
		User user = new User();
		user.setName("ali");
		user.setEmail("ali@gmail.com");
		
		Response response = Response.ok().entity(user).build();
		
		return response;
	}
}
