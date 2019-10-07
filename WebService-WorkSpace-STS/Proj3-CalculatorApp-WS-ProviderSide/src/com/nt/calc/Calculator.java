package com.nt.calc;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
public interface Calculator {
	@WebMethod
	public @WebResult int add(@WebParam int a,@WebParam int b);

}
