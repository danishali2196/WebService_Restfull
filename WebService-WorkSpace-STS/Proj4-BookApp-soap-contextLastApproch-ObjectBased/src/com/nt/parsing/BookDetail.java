package com.nt.parsing;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.nt.binding.Book;

@WebService(name="Book")
public interface BookDetail {

	@WebMethod
	public @WebResult Book getBook(@WebParam int bookid); 
	
}
