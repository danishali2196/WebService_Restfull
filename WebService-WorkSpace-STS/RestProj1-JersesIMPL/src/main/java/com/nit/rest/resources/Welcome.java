package com.nit.rest.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;


@Path("/wish")
public class Welcome {
	
	public Welcome() {
		
		System.out.println("Welcome.Welcome()");
	}
	
	@GET
	public String userWish() {

		System.out.println("Welcome.userWish()");
		return "Welcome to Restfull Services";
		
	}

}
