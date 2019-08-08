package com.nucleus;

import java.util.List;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Address implements InitializingBean, DisposableBean 
{
private String city;
private String country;
private List<String> landmarks;


public Address() {
	System.out.println("Address constrcutor");
}
public List<String> getLandmarks() {
	return landmarks;
}
public void setLandmarks(List<String> landmarks) {
	this.landmarks = landmarks;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	System.out.println("setter");
	this.city = city;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
@Override
public void afterPropertiesSet() throws Exception {
	System.out.println("afterPropertiesSet() method");
	
}
@Override
public void destroy() throws Exception {
	System.out.println("destroy...");
	
}

}
