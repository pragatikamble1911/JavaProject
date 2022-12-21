package example.spring.core;

public class WelcomeService implements GreetingService {
	public WelcomeService() {
		System.out.println("WelcomeService: no-arg");
}
	@Override
	public String sayGreeting() {
		
		return "Welcome from Spring";
	}
}

