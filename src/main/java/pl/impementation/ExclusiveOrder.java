package pl.impementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import pl.api.GoodPizzaa;
import pl.api.IOrder;
import pl.api.IPIzza;

import java.util.List;

@Component
@Primary
public class ExclusiveOrder implements IOrder {

    @Value("#{listOfPizza[0]}")
    private IPIzza ipIzza;

    @Autowired
    private List<IPIzza> listOfPizza;
    public void setIpIzza(IPIzza ipIzza) {
        this.ipIzza = ipIzza;
    }


    public ExclusiveOrder() {
        super();

    }

    public void printOrder() {
        System.out.println("Zamowienie exclusive: "+ipIzza.getName() +" cena: "+ipIzza.getPrice());
    }
}
