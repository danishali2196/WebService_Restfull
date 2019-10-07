package com.nt.msgbody;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyReader;

import com.nt.bind.User;

public class MyMsgBodyReader implements MessageBodyReader<User> {

	public MyMsgBodyReader() {
		System.out.println("MyMsgBodyReader.MyMsgBodyReader()");
	}
	
	@Override
	public boolean isReadable(Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType) {
		return (type == User.class);
	}

	@Override
	public User readFrom(Class<User> type, Type genericType, Annotation[] annotations, MediaType mediaType,
			MultivaluedMap<String, String> httpHeaders, InputStream entityStream)
			throws IOException, WebApplicationException {
		
		BufferedReader reader = null;
		
		reader = new BufferedReader(new InputStreamReader(entityStream));
		
		String name = reader.readLine();
		String email = reader.readLine();
		
		User user = new User();
		user.setName(name);
		user.setEmail(email);
		
		return user;
		
	
	}

}
