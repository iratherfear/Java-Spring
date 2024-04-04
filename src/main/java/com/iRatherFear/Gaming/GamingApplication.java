package com.iRatherFear.Gaming;

import com.iRatherFear.Gaming.HelloWorld.HelloWorldConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class GamingApplication {

	public static void main(String[] args) {
//		SpringApplication.run(GamingApplication.class, args);
		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		System.out.println("Name bean: " + context.getBean("name"));
		System.out.println("Age bean: " + context.getBean("age"));
		System.out.println("Person bean: " + context.getBean("person"));
//		System.out.println("Address bean: " + context.getBean("address"));
		System.out.println("Address bean with different name than function name using name tag in bean annotation: " + context.getBean("getAddress"));
		System.out.println("Person bean with values derived from other beans: " + context.getBean("getPersonUsingExistingBean"));
		System.out.println("Person2 bean with parameteised method: " + context.getBean("personParameterised"));
	}

}
