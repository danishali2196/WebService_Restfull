package com.nt.dateFormat;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.JsonSerializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializable;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;

public class MySerializer  extends JsonSerializer<Date>{

	@Override
	public void serialize(Date d, org.codehaus.jackson.JsonGenerator jgen,
			org.codehaus.jackson.map.SerializerProvider provider) throws IOException, JsonProcessingException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
		String result = sdf.format(d);
		jgen.writeString(result);
		
	}
	
}

	

