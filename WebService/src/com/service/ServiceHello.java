package com.service;

import javax.jws.WebService;

@WebService
public class ServiceHello {
	
	public String getValue(String name){
		return "Ľ������"+ name;
	}
	
}
