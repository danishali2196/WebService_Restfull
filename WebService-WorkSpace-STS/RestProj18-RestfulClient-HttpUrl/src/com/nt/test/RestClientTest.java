package com.nt.test;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class RestClientTest {

	public static void main(String[] args) throws Exception{

		URL url = new URL("http://localhost:3030/RestProj1-JersesIMPL/rest/wish");
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		System.out.println("RestClientTest.main()");
		conn.setRequestMethod("GET");
		conn.setRequestProperty("accept", "application/xml");
		InputStream is = conn.getInputStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		
		String output = br.readLine();
		
		int status = conn.getResponseCode();
	
		if (status == 200) {
			System.out.println(output);
		}
		else {
			throw new RuntimeException("Failed : HTTP Error Code ::"+status);
		}
		
		conn.disconnect();
		
		
		
	}
}