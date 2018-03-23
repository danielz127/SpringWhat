package pl.Pizzeria;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.api.IOrder;
import pl.impementation.Order;
import pl.pl.config.Autoconfig;
import pl.pl.config.Config;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext apc = new AnnotationConfigApplicationContext(Autoconfig.class);
        IOrder order = apc.getBean(IOrder.class);
        order.printOrder();

        IOrder order2 = apc.getBean(Order.class);
        order2.printOrder();
    }
}
