package com.nt.errConfig;


public class PnrNotFountException extends Exception{
	public PnrNotFountException() {
		System.out.println("PnrNotFountException.PnrNotFountException()");
	}
	

	public PnrNotFountException(String exceptionMsg) {
		super(exceptionMsg);
	}
	
	
	
}