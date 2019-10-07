package com.nt.test;

import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.codehaus.jackson.map.ObjectMapper;

import com.nt.bind.Customer;

@Path("/cust")
public class ConvertJavaToJson {

	@GET
	public void showCustomer()throws Exception{
		ObjectMapper mapper = new ObjectMapper();
		
		Customer cust = new Customer();
		cust.setCostomerId(101);
		cust.setCostomerName("Danish");
		cust.setCostomerEmail("danishali2196@gmail.com");
		cust.setDob(new Date());
			
//		String result = mapper.writeValueAsString(cust);
		String result = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(cust);
		
		System.out.println(result);
		
	}

}
