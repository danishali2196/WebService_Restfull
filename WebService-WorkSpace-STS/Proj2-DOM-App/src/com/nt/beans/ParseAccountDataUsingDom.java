package com.nt.beans;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class ParseAccountDataUsingDom {
	public static void main(String[] args) throws Exception{
		DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
		DocumentBuilder builder=factory.newDocumentBuilder();
		Document doc=builder.parse("Account.xml");
		Element rootEl = doc.getDocumentElement();
		
		NodeList nodeList = doc.getElementsByTagName("Book");
		if (nodeList != null) {
			for (int i = 0; i < nodeList.getLength(); i++) {
				Node node=nodeList.item(i);
				if (node.getNodeType() == Document.ELEMENT_NODE) {
					Element ele=(Element) node;
					System.out.println("id::"+ele.getElementsByTagName("id").item(0).getTextContent());
					System.out.println("name::"+ele.getElementsByTagName("name").item(0).getTextContent());
					
				}
			}
		}
		
	}
}
