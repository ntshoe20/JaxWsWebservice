package web.service.client;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import soap.web.service.HelloWorld;

/*
 * A client to test the web service created 
 */

public class HelloWorldClient {
	
	public static void main(String...args) throws Exception{
		
		URL url = new URL("http://localhost:9999/ws/hello?wsdl");//the uri where the wsdl is deployed
		
		QName qname = new QName("http://service.web.soap/", "HelloWorldImplService");//Namespace + service being called, this is on the wsdl
		
		Service service = Service.create(url, qname);
		
		HelloWorld hello = service.getPort(HelloWorld.class);

        System.out.println(hello.getHelloWorldAsString("Itumeleng"));
		
		
	}

}
