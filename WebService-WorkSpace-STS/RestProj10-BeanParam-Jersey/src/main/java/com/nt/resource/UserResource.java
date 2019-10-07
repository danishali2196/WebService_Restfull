package com.nt.resource;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;

import com.nt.bind.User;
import com.sun.media.jfxmedia.Media;

@Path("/user")

public class UserResource {
	
	public UserResource() {
		System.out.println("UserResource.UserResource()");
	}
	
	@POST
	@Path("/fp")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response getUserData(@BeanParam User user) {
		System.out.println("UserResource.getUserData()");
		String name = user.getName();
		String email = user.getEmail();
		System.out.println(name+"   "+email);
		return Response.ok().entity("form value get "+name+" "+email).build();
		
	}
}

