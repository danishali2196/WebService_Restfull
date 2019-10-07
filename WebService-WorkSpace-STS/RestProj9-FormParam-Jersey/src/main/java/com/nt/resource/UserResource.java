package com.nt.resource;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/user")
public class UserResource {
	
	public UserResource() {
		System.out.println("UserResource.UserResource()");
	}
	
	@POST
	@Path("/fp")
	public Response getUserData(@FormParam(value="name") String name,@FormParam(value="email")String email) {
		System.out.println("UserResource.getUserData()");
		return Response.ok().entity("form value get "+name+" "+email).build();
		
	}
}

