package spring.app.helloworld;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import spring.app.helloworld.implementations.Message;
import spring.app.helloworld.interfaces.MessageService;

@SpringBootApplication
public class HelloWorldApplication {

	// utworzenie metody będącej implementacją klasy Message (kiedyś zostanie użyta):
	@Bean
	MessageService messageService()	{
		return new Message();
	}

	public static void main(String[] args) {

		SpringApplication.run(HelloWorldApplication.class, args);

		// wywoływanie kontenera systemu Spring:
		ApplicationContext applicationContext =
				new AnnotationConfigApplicationContext(HelloWorldApplication.class);

		// wstrzykiwanie prostej implementacji interfejsy MessageService
		MessageService messageService = applicationContext.getBean(MessageService.class);
		System.out.println(messageService.displayMessage());

	}

}
