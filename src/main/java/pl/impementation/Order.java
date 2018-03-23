package pl.impementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import pl.api.GoodPizzaa;
import pl.api.IOrder;
import pl.api.IPIzza;

@Component
public class Order implements IOrder {
    @Autowired
    @GoodPizzaa
    private IPIzza ipIzza;


    public Order(IPIzza pizza) {
        super();

        this.ipIzza = pizza;
    }

    public void printOrder() {
        System.out.println("Zamowienie: "+ipIzza.getName() +" cena: "+ipIzza.getPrice());
    }
}
