package guru.springframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import guru.springframework.controllers.MyController;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
			
		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);
		
		MyController myController = (MyController) ctx.getBean("myController"); 
		
		myController.hello();
	}
	
}
