package com.ruby.projects.utilities;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringUtil {
	
	private static final ApplicationContext context;
	
	static{
		context = new ClassPathXmlApplicationContext( 
				new String[]{
					"Beans.xml",
					"companyInfo.xml"
				});
	}
	private SpringUtil(){
		
	}
	public static Object getObject(String beanName){
		return context.getBean(beanName);
	}
}
