package com.how2java.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.how2java.pojo.Product;


public class TestSpring04 {
	//在Product.java的category属性前加上@Autowired注解
	//使用注解的方式完成注入对象中的效果
	
    //除了前面的 在属性前加上@Autowired 这种方式外，
    //也可以在setCategory方法前加上@Autowired，这样来达到相同的效果
	
	//除了@Autowired之外，@Resource也是常用的手段
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[]{"applicationContext.xml"});
		Product p = (Product)context.getBean("p");
		System.out.println(p.getName());
		System.out.println(p.getCategory().getName());
	}
}
