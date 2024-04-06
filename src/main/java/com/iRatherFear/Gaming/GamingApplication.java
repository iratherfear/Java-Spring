package com.iRatherFear.Gaming;
import com.iRatherFear.Gaming.game.GamingController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("com.iRatherFear.Gaming.game")
public class GamingApplication {
	public static void main(String[] args) {
//		SpringApplication.run(GamingApplication.class, args);
		try(var context = new AnnotationConfigApplicationContext(GamingApplication.class)) {
//			System.out.println(context.getBean("gamingConsole"));
			context.getBean(GamingController.class).run();
//			System.out.println(context.getBean("gamingController"));
		}
	}
}
