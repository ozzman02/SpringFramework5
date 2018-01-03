package guru.springframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

//import guru.springframework.controllers.ConstructorInjectedController;
//import guru.springframework.controllers.MyController;
//import guru.springframework.controllers.PropertyInjectedController;
//import guru.springframework.controllers.SetterInjectedController;
import guru.springframework.examplebeans.FakeDataSource;
import guru.springframework.examplebeans.FakeJmsBroker;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
			
		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);
		
		//MyController myController = (MyController) ctx.getBean("myController"); 
		//myController.sayHello();
		
		//System.out.println(ctx.getBean(MyController.class).sayHello());
		//System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
		//System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
		//System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello()); 
		
		
		FakeDataSource fakeDataSource = (FakeDataSource) ctx.getBean(FakeDataSource.class);
		System.out.println(fakeDataSource.toString());
		
		FakeJmsBroker fakeJmsBroker = (FakeJmsBroker) ctx.getBean(FakeJmsBroker.class);
		System.out.println(fakeJmsBroker.toString());
		
	}
	
}
