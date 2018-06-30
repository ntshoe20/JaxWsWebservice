package soap.web.service;

import javax.jws.WebService;

/*
 * implementation of Hello world - Step 2
 */

@WebService(endpointInterface = "soap.web.service.HelloWorld")
public class HelloWorldImpl implements HelloWorld{
	
	@Override
	public String getHelloWorldAsString(String name) {
		return "Hello World JAX-WS " + name;
	}

}
