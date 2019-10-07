package com.nt.test;

import java.util.Date;

import org.codehaus.jackson.map.ObjectMapper;

import com.nt.bind.Customer;

public class ConvertJavaToJson {

	public static void main(String[] args) throws Exception{
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
