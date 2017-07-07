package com.service;

import javax.jws.WebService;

@WebService
public class ServiceHello {
	
	public String getValue(String name){
		return "Ä½¿ÎÍø£º"+ name;
	}
	
}
