package com.nt.resource;

import javax.print.DocFlavor.STRING;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.nt.bind.Pessanger;
import com.nt.errConfig.PnrNotFountException;

@Path("/status")
public class TrainPnrStatus {
	
	public TrainPnrStatus() {
		System.out.println("TrainPnrStatus:Contructor()");
	}
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("{pnr}")
	public Response getStatus(@PathParam("pnr") String pnr) throws Exception {
		System.out.println("TrainPnrStatus.getStatus()");
		Response res = null;
		System.out.println("pnr ::" +pnr);
		String vpnr = "asd123";
		if (vpnr.equals(pnr)) {
			System.out.println("TrainPnrStatus.getStatus():::inside if");
			Pessanger pass = new Pessanger();
			pass.setPnr(pnr);
			pass.setPname("danish");
			pass.setAge(23);
			System.out.println("TrainPnrStatus.getStatus()::::::"+pass);
			res = Response.ok(pass).build();

		}
		else {
			System.out.println("TrainPnrStatus.getStatus()::else()"); 
			throw new PnrNotFountException("invalid pnr");
			
		}
		return res;
	
	}

}
