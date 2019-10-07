package com.nt.cfgs;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Singleton;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/rest/*")
@Singleton
public class MyApplication extends Application {
	
	public MyApplication() {
		System.out.println("MyApplication.MyApplication()");
	}
	
	@Override
	public Map<String, Object> getProperties() {
		Map<String,Object> map = new  HashMap();
		map.put("jersey.config.server.provider.packages","com.nt");
		return map;
	}

}
