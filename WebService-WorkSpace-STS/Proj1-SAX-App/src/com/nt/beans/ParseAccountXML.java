package com.nt.beans;

import java.io.File;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import com.nt.hendler.AccountHandrel;

public class ParseAccountXML {
	
	public static void main(String[] args) throws Exception{
		
		SAXParserFactory factory = SAXParserFactory.newInstance();
		
		SAXParser parsel = factory.newSAXParser();
		
		parsel.parse(new File("Account.xml"),new AccountHandrel());

	}

}
