package com.server;

import javax.jws.WebService;

@WebService
public interface ServiceHello {
	String say(String name);
	
	int add(int a,int b);
	
	int sub(int c,int d);
}
