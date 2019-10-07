package com.nt.test;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nt.binding.Customer;


@Path("/cust")
public class JsonService {
	
	@GET
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public String getCustomer() throws Exception{
		System.out.println("JsonService.getCustomer()");
		Customer cust = new Customer();
		cust.setCid(1001);
		cust.setName("Danish");
		cust.setAddrs("Hyd");
		System.out.println(cust);
		
		ObjectMapper mapper = new ObjectMapper();
		String result = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(cust);
		return result;
	}
	
	@POST
	@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Response setCustomer(Customer cust1) {
		System.out.println("JsonService.setCustomer()");
//		cust1.getCid();
//		cust1.getName();
//		cust1.getAddrs();
		String result = "Customer saved : " + cust1;
		return Response.status(201).entity(result).build();
//		System.out.println("cust1::" + cust1);
//		if (cust1 != null) {
//			return "Customer Inserted Succeseful";
//		}
//		
//			return "Customer Not Inserted";
		
	}

}
