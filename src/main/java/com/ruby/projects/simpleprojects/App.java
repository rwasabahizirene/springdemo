package com.ruby.projects.simpleprojects;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ruby.projects.utilities.SpringUtil;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void execute(){
        
        SpringTest springTestA = (SpringTest) SpringUtil.getObject("springTest");
        SpringTest springTestB = (SpringTest) SpringUtil.getObject("springTest");
        System.out.println(springTestA.getSpringTestVal4Value());
        System.out.println(springTestB.getSpringTestVal4Value());
        System.out.println(springTestA == springTestB);
        
        SpringTest2 springTestc = (SpringTest2) SpringUtil.getObject("anotherClass");
        System.out.println(springTestc.getVariable4());
        
        shipeProducts();
    }

	private static void shipeProducts() {
		
		Company company = (Company) SpringUtil.getObject("companyBean");
		System.out.println(company);
		Address add1 = (Address) SpringUtil.getObject("addressBean");
		Address add2 = (Address) SpringUtil.getObject("address");
		System.out.println(add1);;
		
	}
}
