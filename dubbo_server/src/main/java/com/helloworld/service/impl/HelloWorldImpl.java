package com.helloworld.service.impl;

import com.helloworld.service.HelloWorld;

public class HelloWorldImpl implements HelloWorld {
	public String sayHello(String name) {
		System.out.println("init : " + name);
		return "hello " + name;
	}
}
