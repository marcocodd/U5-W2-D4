package marco.U5W2D4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class U5W2D4Application {

	public static void main(String[] args) {
		SpringApplication.run(com.epicode.U5D1.U5D1Application.class, args);

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(U5W2D4Application.class);

		Menu m = (com.epicode.U5D1.entities.Menu) ctx.getBean("menu");

		m.printMenu();
		ctx.close();
	}

}
