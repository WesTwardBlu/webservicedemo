package com.test;

import com.client.ServiceHello;
import com.client.ServiceHelloService;

public class ServiceTest {

	/**
	 * �ͻ��˸���WSDL����Java�ļ�������ʹ��jdk�Դ����
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
