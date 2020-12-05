package pl.akademiakodu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;
import pl.akademiakodu.beans.MessagePrinter;

@SpringBootApplication
@ImportResource("classpath:beans-config.xml")
public class DependencyInjectionApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(DependencyInjectionApplication.class, args);
		MessagePrinter printer = ctx.getBean(MessagePrinter.class);
		System.out.println("DZIAŁA");
		printer.print();
		System.out.println("Haha:) "+printer.getName());
		ctx.close();

	}
}
