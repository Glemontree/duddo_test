package com.helloworld.main;

import com.helloworld.service.HelloWorld;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientMain {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "applicationConsumer.xml" });
		context.start();
		HelloWorld service = (HelloWorld) context.getBean("helloWorld");
		System.out.println(service.sayHello("world"));
		context.close();
	}
}
