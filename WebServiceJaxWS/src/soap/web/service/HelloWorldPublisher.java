package soap.web.service;

import javax.xml.ws.Endpoint;

/*
 * End point publisher - Step 3
 */

public class HelloWorldPublisher {
	
	public static void main(String[] args) {
		   Endpoint.publish("http://localhost:9999/ws/hello", new HelloWorldImpl());
	    }

}
