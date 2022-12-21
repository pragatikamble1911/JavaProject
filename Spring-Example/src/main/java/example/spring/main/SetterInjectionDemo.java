package example.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import example.spring.core.GreetingService;

public class SetterInjectionDemo {
	
	public static void main(String[] args) {
		String filePath = "./src/main/resources/spring-config.xml";
		//Building the ApplicationContext using File System Env based upon the file path
		ApplicationContext ctx  = new FileSystemXmlApplicationContext(filePath);
		//Obtaining the bean having ID: user1
		Object obj = ctx.getBean("user1");
		//Type Cast Object into GreetingService
		GreetingService gs = (GreetingService)obj;
		//Invoke the method
		String reply = gs.sayGreeting();
		System.out.println(reply);
	

}
}
