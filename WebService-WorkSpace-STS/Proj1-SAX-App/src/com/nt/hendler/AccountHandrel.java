package com.nt.hendler;

import java.util.Arrays;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class AccountHandrel extends DefaultHandler{
	
	boolean id=false;
	boolean name=false;
	
	@Override
	public void startDocument() throws SAXException {
		//	System.out.println("Document Start");
	}
	
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attribute) throws SAXException {
		if (qName.equals("id")) {
			id=true;
		//	System.out.println("Element Started");
		}
		if (qName.equals("name")) {
			name=true;
			//System.out.println("Element Started");
		}
		
	}
	
	@Override
	public void characters(char[] ch, int start, int end) throws SAXException {
		if(id) {
			System.out.println("Book id ::"+new String(ch,start,end));
			id=false;
		}
		else if (name) {
			System.out.println("Book name ::"+new String(ch,start,end));
			name=false;
		}
	}
	@Override
	public void endElement(String arg0, String arg1, String arg2) throws SAXException {
		//System.out.println("Element Ended");
	}
	
	@Override
	public void endDocument() throws SAXException {
		//System.out.println("Document Ended");
	}

}
