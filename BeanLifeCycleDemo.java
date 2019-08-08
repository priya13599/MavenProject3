package com.nucleus;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemo {

	public static void main(String[] args) {
		
		//Bean Definition Inheritance
		ApplicationContext context=new ClassPathXmlApplicationContext("springconfig2.xml");
		Address adr1=(Address)context.getBean("adr1");
		System.out.println(adr1.getCity()+" "+adr1.getCountry());
		
		Address adr2=(Address)context.getBean("adr2");
		System.out.println(adr2.getCity()+" "+adr2.getCountry());
		//Life Cycle...
		/*AbstractApplicationContext context=new ClassPathXmlApplicationContext("springconfig.xml");
		Address adr1=(Address)context.getBean("adr1");
		adr1.setCity("Mumbai");

		context.registerShutdownHook();*/
	}

}
