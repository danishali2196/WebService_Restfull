package com.nit.sbapp.bind;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@XmlRootElement(name="Book")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class Book {
	
	private int bookid;
	private String bookname;
	private double price;

}
