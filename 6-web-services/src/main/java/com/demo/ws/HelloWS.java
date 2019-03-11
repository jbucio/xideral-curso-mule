package com.demo.ws;

import javax.jws.WebService;

@WebService
public interface HelloWS {

	String saludo(String name);
	
}