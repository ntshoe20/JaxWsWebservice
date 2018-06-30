package soap.web.service;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

/*
 * http://www.mkyong.com/webservices/jax-ws/jax-ws-hello-world-example/
 * 2018-06-14
 * Interface creation - Step 1
 */

@WebService
@SOAPBinding(style = Style.RPC)
public interface HelloWorld {
	
	@WebMethod String getHelloWorldAsString(String name);

}
