package com.how2java.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.how2java.pojo.Product;


public class TestSpring04 {
	//��Product.java��category����ǰ����@Autowiredע��
	//ʹ��ע��ķ�ʽ���ע������е�Ч��
	
    //����ǰ��� ������ǰ����@Autowired ���ַ�ʽ�⣬
    //Ҳ������setCategory����ǰ����@Autowired���������ﵽ��ͬ��Ч��
	
	//����@Autowired֮�⣬@ResourceҲ�ǳ��õ��ֶ�
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[]{"applicationContext.xml"});
		Product p = (Product)context.getBean("p");
		System.out.println(p.getName());
		System.out.println(p.getCategory().getName());
	}
}
