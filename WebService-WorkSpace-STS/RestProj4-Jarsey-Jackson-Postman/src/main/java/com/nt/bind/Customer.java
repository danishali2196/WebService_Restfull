package com.nt.bind;



import java.util.Date;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

import com.nt.dateFormat.MySerializer;

import lombok.Data;

@Data
//@JsonPropertyOrder({"costomer-id","costomer-email","costomer-name"})
@JsonSerialize(include=Inclusion.NON_NULL)
public class Customer {
	
	@JsonProperty("customer-id")
	private int costomerId;
	
	@JsonProperty("customer-name")
	private String costomerName;
	
	@JsonIgnore
	@JsonProperty("custome-email")
	private String costomerEmail;
	
	@JsonProperty("dob")
	@JsonSerialize(using=MySerializer.class)
	private Date dob;

}
