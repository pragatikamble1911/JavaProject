package example.spring.core;

public class HelloService implements GreetingService {

	public HelloService() {

			System.out.println("HelloService:no-arg");
	}

	@Override
	public String sayGreeting() {
		
		return "Hello from Spring";
	}

}
