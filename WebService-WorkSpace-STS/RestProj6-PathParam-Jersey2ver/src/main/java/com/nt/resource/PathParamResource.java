package com.nt.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import com.nt.bind.Book;

@Path("/book")
public class PathParamResource {
	static {
		System.out.println("PathParamResource.enclosing_method()");
	}
	public PathParamResource() {
		System.out.println("PathParamResource::PathParamResource()");

	}
	
	@GET
	@Path("{bid}")
	public Response getBooks(@PathParam("bid") String bid) {
		System.out.println("PathParamResource.getBooks()");
		Book book = new Book();
		book.setBookId(Integer.parseInt(bid));
		book.setBookName("spring");
		book.setAutherName("johnson");	
		System.out.println(book);
		
		return Response.status(200).entity("getUserById is called, id : " + bid).build();
	}

}
