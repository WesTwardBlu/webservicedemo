package com.client;


public class Test {
	public static void main(String[] args)  {
		ServiceHello serviceHello=new ServiceHello_Service().getServiceHelloImplPort();
		System.out.println("say:"+ serviceHello.say("bob"));
	}
}
