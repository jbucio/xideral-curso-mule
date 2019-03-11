package com.demo.ws;

import javax.jws.WebService;

@WebService(endpointInterface = "com.demo.ws.HelloWS", serviceName="HelloWorldService")
public class HelloWSImpl implements HelloWS {

	@Override
	public String saludo(String name) {
		return "Hola " + name;
	}

}
