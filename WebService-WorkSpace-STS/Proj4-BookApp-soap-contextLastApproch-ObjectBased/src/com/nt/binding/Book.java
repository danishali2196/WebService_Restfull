package com.nt.binding;


import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement(name="Book-Detail")
public class Book {
	private int bookId;
	private String bookName;
	private String authorName;
	private float price;

}
