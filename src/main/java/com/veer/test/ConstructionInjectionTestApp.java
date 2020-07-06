package com.veer.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.veer.beans.Employee;

public class ConstructionInjectionTestApp {

	public static void main(String[] args) {


		 Resource r=new ClassPathResource("com/veer/cfgs/applicationContext.xml");  
	     BeanFactory factory=new XmlBeanFactory(r);  
         Employee s= factory.getBean("employee",Employee.class);  
         s.show();  

	}

}
