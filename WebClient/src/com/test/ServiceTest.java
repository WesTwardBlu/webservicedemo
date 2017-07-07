package com.test;

import com.client.ServiceHello;
import com.client.ServiceHelloService;

public class ServiceTest {

	/**
	 * 客户端根据WSDL生成Java文件，可以使用jdk自带命令：
	 * wsimport -s G:\workspace10\TheClient\src -p com.client -keep http://localhost:9001/Service/ServiceHello?wsdl
	 * */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServiceHello serviceHello= new ServiceHelloService().getServiceHelloPort();
		System.out.println("send:  "+ "andi");
		String name= serviceHello.getValue("andi");
		System.out.println("recive:"+ name);
	}

}
