package com.nt.parsing;

import javax.jws.WebService;

import com.nt.binding.Book;

@WebService(endpointInterface="com.nt.parsing.BookDetail")
public class BookDetailImpl implements BookDetail {

	@Override
	public Book getBook(int bookid) {
		Book b1=new Book();
		b1.setBookId(100);
		b1.setBookName("Spring");
		b1.setPrice(450);
		b1.setAuthorName("Rod Johnson");
		System.out.println(b1);
		return b1;
	}
	
	

}
