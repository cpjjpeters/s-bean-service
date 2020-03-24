package be.ipeters.home;

public class App {

	public static void main(String[] args) {

		try(ConfigurableApplicationContext context = new AnnotationConfigApplicationContext("be.ipeters.home");){
			GreetingService greetingService = context.getBean(GreetingService.class);
			greetingService.greet();
		}
	}

}
