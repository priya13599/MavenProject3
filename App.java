package com.nucleus;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
     
    	ApplicationContext context=new ClassPathXmlApplicationContext("springconfig.xml");
    	
    	
    	
    	
    	
    	/*Student s1=(Student)context.getBean("s1");
    	System.out.println(s1.getStudentId()+ " "+s1.getStdName());
    	
    	Student s01=(Student)context.getBean("s1");
    	System.out.println(s01.getStudentId()+ " "+s01.getStdName());
    	System.out.println(s1==s01);*/
    	
    	Student s2=(Student)context.getBean("s2");
    	System.out.println(s2.getStudentId()+ " "+s2.getStdName()+" "+s2.getAddress().getCity());
    	
    	/*s2.setStdName("abc");
    	System.out.println(s2.getStudentId()+ " "+s2.getStdName());*/
    	
    }
}
