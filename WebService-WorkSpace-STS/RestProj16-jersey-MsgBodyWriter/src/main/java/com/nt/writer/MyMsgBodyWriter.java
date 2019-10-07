package com.nt.writer;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Writer;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyWriter;
import javax.ws.rs.ext.Provider;

import com.nt.bind.User;

@Provider
public class MyMsgBodyWriter implements MessageBodyWriter<User> {
	
	public MyMsgBodyWriter() {
		System.out.println("MyMsgBodyWriter.MyMsgBodyWriter()");
	}

	@Override
	public boolean isWriteable(Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType) {
		// TODO Auto-generated method stub
		return (type == User.class);
	}

	@Override
	public long getSize(User t, Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType) {
		// TODO Auto-generated method stub
		return 10000;
	}

	@Override
	public void writeTo(User t, Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType,
			MultivaluedMap<String, Object> httpHeaders, OutputStream entityStream)
			throws IOException, WebApplicationException {
		
		Writer write = new PrintWriter(entityStream);
		write.write(t.getName());
		write.write(t.getEmail());
		write.flush();
		write.close();
		
	}

}
