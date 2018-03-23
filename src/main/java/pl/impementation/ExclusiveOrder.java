package pl.impementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import pl.api.GoodPizzaa;
import pl.api.IOrder;
import pl.api.IPIzza;

@Component
@Primary
public class ExclusiveOrder implements IOrder {

    @Autowired
    public void setIpIzza(IPIzza ipIzza) {
        this.ipIzza = ipIzza;
    }

    private IPIzza ipIzza;

    public ExclusiveOrder() {
        super();

    }

    public void printOrder() {
        System.out.println("Zamowienie exclusive: "+ipIzza.getName() +" cena: "+ipIzza.getPrice());
    }
}
