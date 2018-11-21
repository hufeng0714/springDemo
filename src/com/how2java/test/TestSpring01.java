package com.how2java.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.how2java.pojo.Category;

		/*
		 测试代码，演示通过spring获取Category对象，以及该对象被注入的name属性。
		如图所示，可以打印出通过Spring拿到的Category对象的name属性
		 */
public class TestSpring01 {
    
	/*
		以获取对象的方式来进行比较
		
		传统的方式： 
		通过new 关键字主动创建一个对象
		IOC方式
		对象的生命周期由Spring来管理，直接从Spring那里去获取一个对象。
		IOC是反转控制 (Inversion Of Control)的缩写，就像控制权从本来在自己手里，交给了Spring。
	 */
	public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] { "applicationContext.xml" });
 
        Category c = (Category) context.getBean("c");
         
        System.out.println(c.getName());
    }
}
