package com.nt.test;

import com.nt.parsing.Book;
import com.nt.parsing.BookDetailImplService;

public class BookTest {

	public static void main(String[] args) {
		BookDetailImplService bookService=new BookDetailImplService();
		
		Book book=bookService.getBookDetailImplPort();
		
		book.getBook(100);
		
		System.out.println(book.toString());
	}

}
