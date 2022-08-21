package com.valtech.wiremockandIntegrationtesting;

import java.util.HashMap;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



public class WiremockandIntegrationtestingApplication2 {

	public static void main(String[] args) {
		
		HashMap popp=new HashMap<String, String>();
		popp.put("d", "zabi");
		s e=new s();
		e.seeet((String)popp.get(null));
		
		
		e.get().charAt(0);
		System.out.println();
		//Optional pop=Optional.of(dd());
		//System.out.println(pop.orElseGet(()->new Object()));
		doSomething(null);

	}
	public static void doSomething(Object obj) {
		   // Do something to obj, assumes obj is not null
		   obj.getClass();
		}
public static String dd()
{
	return null;
}
}
class s
{
	String sss;
	public void seeet(String ss)
	{
		sss=ss;
	}
	public String get()
	{
		return sss;
	}
}
