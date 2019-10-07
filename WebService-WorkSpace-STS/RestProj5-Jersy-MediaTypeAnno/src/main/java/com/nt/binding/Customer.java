package com.nt.binding;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@XmlRootElement(name="Customer")
@XmlAccessorType(XmlAccessType.FIELD)
public class Customer {
	
	@JsonProperty("Client-Id")
	private int cid;
	
	@JsonProperty("Client-Name")
	private String name;
	
	@JsonProperty("Client-Addrs")
	private String addrs;

}
