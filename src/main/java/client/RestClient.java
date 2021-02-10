package client;

import java.io.IOException;
import java.util.HashMap;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

public class RestClient {
	
	public void get(String url ) throws ClientProtocolException, IOException {
		CloseableHttpClient  closeableClient =HttpClients.createDefault();
	HttpGet httpget = new HttpGet(url);
	
	CloseableHttpResponse closeableHttpResponse=closeableClient.execute(httpget);
	int statusCode=closeableHttpResponse.getStatusLine().getStatusCode();
	System.out.println("staus code is"+ statusCode);
	String responseString =EntityUtils.toString(closeableHttpResponse.getEntity(),"UFT-8");
	
	JSONObject jsonResponse = new JSONObject(responseString);
	System.out.println("json resonse's are"+jsonResponse);
	
	Header[]  headerArray =closeableHttpResponse.getAllHeaders();
	HashMap<String , String >allHeader = new HashMap<String,String>();
	
	for( Header header :headerArray ) {
		allHeader.put(header.getName(), header.getValue());
		
	}
	System.out.println("all headers are="+allHeader);
	
	
	
	
	
	
	
	
	
	}
	
	

}
