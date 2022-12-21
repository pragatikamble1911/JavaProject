package example.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringObjectLoadingDemo {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			//Setting the file path
			String filePath = "./src/main/resources/spring-config.xml";
			//Building the ApplicationContext using File System Environment based upon the file path
			//ApplicationContext ctx  = new FileSystemXmlApplicationContext(filePath);
			ApplicationContext ctx  = new ClassPathXmlApplicationContext("spring-config.xml");
			ctx.getBean("greet2");
			

		}

	}

