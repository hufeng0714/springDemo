package com.how2java.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.how2java.pojo.Product;

public class TestSpring02 {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] {"applicationContext.xml"});
		Product p = (Product) context.getBean("p");
		System.out.println(p.getName());
	}
}
