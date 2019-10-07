package com.nt.bind;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Passengers")
@XmlAccessorType(XmlAccessType.FIELD)
public class Pessanger {
	@XmlElement(name="Pnr-no")
	private String pnr;
	private String pname;
	private int age;
	public String getPnr() {
		return pnr;
	}
	public void setPnr(String pnr) {
		this.pnr = pnr;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Pessanger [pnr=" + pnr + ", pname=" + pname + ", age=" + age + "]";
	}

	
	
	

}
