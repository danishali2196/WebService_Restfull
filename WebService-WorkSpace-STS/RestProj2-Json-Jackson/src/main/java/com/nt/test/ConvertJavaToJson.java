package com.nt.test;

import org.codehaus.jackson.map.ObjectMapper;

import com.nt.bind.Customer;

public class ConvertJavaToJson {

	public static void main(String[] args) throws Exception{
		ObjectMapper mapper = new ObjectMapper();
		
		Customer cust = new Customer();
		cust.setId(101);
		cust.setName("danish");
		cust.setEmail("danishali2196@gmail.com");
		
		String result = mapper.writeValueAsString(cust);
		
		System.out.println(result);
		
	}

}
