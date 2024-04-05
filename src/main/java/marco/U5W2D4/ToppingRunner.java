package marco.U5W2D4;

import marco.U5W2D4.dao.ToppingService;
import marco.U5W2D4.entities.Topping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class ToppingRunner implements CommandLineRunner {
    @Autowired
    private ToppingService toppingService;

    @Override
    public void run(String... args) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(U5W2D4Application.class);
        Topping toppingTomato = (Topping) ctx.getBean("toppings_tomato");
        toppingService.save(toppingTomato);
    }
}
