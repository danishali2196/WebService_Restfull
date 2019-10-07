package com.nt.cfgs;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("")
public class MyApplication extends Application {

	public MyApplication() {
		System.out.println("MyApplication.MyApplication()");
	}
	
//	@Override
//	public Map<String, Object> getProperties() {
//		Map<String,Object> map = new HashMap();
//	map.put("org.jboss.resteasy.plugins.server.servlet.ResteasyBootstrap", "com.nt.resource");
//		return map;
//	}
}
