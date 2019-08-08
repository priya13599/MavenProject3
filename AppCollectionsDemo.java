package com.nucleus;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppCollectionsDemo {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("springconfig.xml");
		Address adr1=(Address)context.getBean("adr1");
		System.out.println(adr1.getCity()+ " "+adr1.getCountry());
		List<String> landmarks=adr1.getLandmarks();
		for(String landmark: landmarks)
		{
			System.out.println(landmark);
		}

	}

}
