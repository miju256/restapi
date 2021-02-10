package com.qa.test;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import client.RestClient;

public class GetSApiTest extends TestBase  {
	TestBase testbase;
	 String servicerUrl;
		String apiUrl;
		String url;
		RestClient restClient;
	@BeforeMethod
		public void setUp() {
	 testbase = new TestBase();
	 servicerUrl =prop.getProperty("serviceUrl");
		
		apiUrl=prop.getProperty("apiUrl");
		 url = servicerUrl+apiUrl;
	
	}
	@Test
	public void getapiTest() throws ClientProtocolException, IOException {
	 restClient = new RestClient();
		restClient.get(url);
	}



}