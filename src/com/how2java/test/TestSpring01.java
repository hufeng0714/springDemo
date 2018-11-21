package com.how2java.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.how2java.pojo.Category;

		/*
		 ���Դ��룬��ʾͨ��spring��ȡCategory�����Լ��ö���ע���name���ԡ�
		��ͼ��ʾ�����Դ�ӡ��ͨ��Spring�õ���Category�����name����
		 */
public class TestSpring01 {
    
	/*
		�Ի�ȡ����ķ�ʽ�����бȽ�
		
		��ͳ�ķ�ʽ�� 
		ͨ��new �ؼ�����������һ������
		IOC��ʽ
		���������������Spring������ֱ�Ӵ�Spring����ȥ��ȡһ������
		IOC�Ƿ�ת���� (Inversion Of Control)����д���������Ȩ�ӱ������Լ����������Spring��
	 */
	public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] { "applicationContext.xml" });
 
        Category c = (Category) context.getBean("c");
         
        System.out.println(c.getName());
    }
}
