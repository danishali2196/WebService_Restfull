package com.nt.calc;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(endpointInterface="com.nt.calc.Calculator")
public class CalculatorImpl implements Calculator {
	
	@Override
	public int add(int a, int b) {

		return a+b;
	}

}
