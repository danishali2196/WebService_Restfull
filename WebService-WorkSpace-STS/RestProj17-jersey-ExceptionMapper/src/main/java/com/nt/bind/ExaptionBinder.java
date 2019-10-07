package com.nt.bind;

import javax.ws.rs.core.Response.Status;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Status")
@XmlAccessorType(XmlAccessType.FIELD)
public class ExaptionBinder {
	
	
	
	private Status errCode;
	private String errMsg;
	public Status getErrCode() {
		return errCode;
	}
	public void setErrCode(Status errCode) {
		this.errCode = errCode;
	}
	public String getErrMsg() {
		return errMsg;
	}
	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}
	@Override
	public String toString() {
		return "ExaptionBinder [errCode=" + errCode + ", errMsg=" + errMsg + "]";
	}

	
	

}
