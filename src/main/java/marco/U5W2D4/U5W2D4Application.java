package marco.U5W2D4;

import marco.U5W2D4.entities.Menu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class U5W2D4Application {

    public static void main(String[] args) {
        SpringApplication.run(marco.U5W2D4.U5W2D4Application.class, args);

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(U5W2D4Application.class);

        Menu m = (marco.U5W2D4.entities.Menu) ctx.getBean("menu");

        m.printMenu();
        ctx.close();
    }

}
