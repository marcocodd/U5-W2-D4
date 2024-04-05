package marco.U5W2D4.entities;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.List;

@Configuration
@PropertySource("application.properties")
public class AppConfig {
    @Bean(name = "toppings_tomato")
    public Topping toppingTomatoBean() {
        return new Topping("Tomato", 0, 0);
    }

    @Bean(name = "toppings_cheese")
    public Topping toppingCheeseBean() {
        return new Topping("Cheese", 92, 0.50);
    }

    @Bean(name = "toppings_ham")
    public Topping toppingHamBean() {
        return new Topping("Ham", 35, 0.99);
    }

    @Bean(name = "toppings_pineapple")
    public Topping toppingPineappleBean() {
        return new Topping("Pineapple", 24, 0.79);
    }

    @Bean(name = "toppings_salami")
    public Topping toppingSalamiBean() {
        return new Topping("Salami", 86, 0.99);
    }


    @Bean(name = "pizza_margherita")
    public Pizza pizzaMargheritaBean() {
        List<Topping> tList = new ArrayList<>();
        tList.add(toppingTomatoBean());
        tList.add(toppingCheeseBean());
        return new Pizza("Pizza Margherita", tList, false);
    }

    @Bean(name = "hawaiian_pizza")
    public Pizza pizzaHawaiianBean() {
        List<Topping> tList = new ArrayList<>();
        tList.add(toppingTomatoBean());
        tList.add(toppingCheeseBean());
        tList.add(toppingHamBean());
        tList.add(toppingPineappleBean());
        return new Pizza("Hawaiian Pizza", tList, false);
    }

    @Bean(name = "salami_pizza")
    public Pizza pizzaSalamiBean() {
        List<Topping> tList = new ArrayList<>();
        tList.add(toppingTomatoBean());
        tList.add(toppingCheeseBean());
        tList.add(toppingSalamiBean());
        return new Pizza("Salami Pizza", tList, false);
    }

    @Bean(name = "salami_pizza_xl")
    public Pizza pizzaSalamiXlBean() {
        List<Topping> tList = new ArrayList<>();
        tList.add(toppingTomatoBean());
        tList.add(toppingCheeseBean());
        tList.add(toppingSalamiBean());
        return new Pizza("Salami Pizza XL", tList, true);
    }

    @Bean(name = "lemonade")
    public Drink lemonadeBean() {
        return new Drink("Lemonade", 128, 1.29);
    }

    @Bean(name = "water")
    public Drink waterBean() {
        return new Drink("Water", 0, 1.29);
    }

    @Bean(name = "wine")
    public Drink wineBean() {
        return new Drink("Wine", 607, 7.49);
    }

//    @Bean(name = "menu")
//    public Menu menuBean() {
//        List<Pizza> pizzaList = new ArrayList<>();
//        List<Drink> drinkList = new ArrayList<>();
//        List<Topping> toppingsList = new ArrayList<>();
//
//        pizzaList.add(pizzaMargheritaBean());
//        pizzaList.add(pizzaHawaiianBean());
//        pizzaList.add(pizzaSalamiBean());
//        pizzaList.add(pizzaSalamiXlBean());
//
//        drinkList.add(lemonadeBean());
//        drinkList.add(waterBean());
//        drinkList.add(wineBean());
//
//        toppingsList.add(toppingTomatoBean());
//        toppingsList.add(toppingCheeseBean());
//        toppingsList.add(toppingSalamiBean());
//        toppingsList.add(toppingHamBean());
//        toppingsList.add(toppingPineappleBean());
//
//        return new Menu(pizzaList, drinkList, toppingsList);
//
//    }
//
//    @Bean("Tavolo1")
//    Table getTable1(@Value("${cover.price}") double coverPrice) {
//        return new Table(1, 5, true, coverPrice);
//    }
//
//    @Bean("Tavolo2")
//    Table getTable2(@Value("${cover.price}") double coverPrice) {
//        return new Table(2, 4, true, coverPrice);
//    }
//
//    @Bean("Tavolo3")
//    Table getTable3(@Value("${cover.price}") double coverPrice) {
//        return new Table(3, 8, true, coverPrice);

}



