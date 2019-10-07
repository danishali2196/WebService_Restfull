package com.nit.eseva.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class EsevaDTO implements Serializable{
	
	private int userId;
	private String name;
	private String addrs;

}
