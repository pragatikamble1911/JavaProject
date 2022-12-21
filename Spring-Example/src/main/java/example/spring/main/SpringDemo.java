package example.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import example.spring.core.GreetingService;

public class SpringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				//Setting the file path
				String filePath = "./src/main/resources/spring-config.xml";
				//Building the ApplicationContext using File System Environment based upon the file path
				ApplicationContext ctx  = new FileSystemXmlApplicationContext(filePath);
				//Obtaining the bean having ID: greet
				Object obj = ctx.getBean("greet");
				//Type Cast Object into GreetingService
				GreetingService gs = (GreetingService)obj;
				//Invoke the method
				String reply = gs.sayGreeting();
				System.out.println(reply);

	}

}
