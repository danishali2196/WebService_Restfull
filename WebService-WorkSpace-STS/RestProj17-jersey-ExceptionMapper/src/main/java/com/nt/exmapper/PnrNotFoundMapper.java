package com.nt.exmapper;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.nt.bind.ExaptionBinder;
import com.nt.errConfig.PnrNotFountException;

@Provider
public class PnrNotFoundMapper implements ExceptionMapper<PnrNotFountException> {
	
	public PnrNotFoundMapper() {
		System.out.println("InvalidConstraint.InvalidConstraint()");
	}

	@Override
	@Produces(MediaType.APPLICATION_XML)
	public Response toResponse(PnrNotFountException exception) {
		System.out.println("PnrNotFoundMapper.toResponse()");
		ExaptionBinder binder = null;
		binder = new ExaptionBinder();
		binder.setErrCode(Status.BAD_REQUEST);
		binder.setErrMsg(exception.getMessage());
		
		return Response.ok().entity(binder).build();
		
	}



}
