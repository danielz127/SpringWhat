package pl.impementation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import pl.api.GoodPizzaa;
import pl.api.IPIzza;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@PropertySource("classpath:ceny.properties")
@GoodPizzaa
public class ExoticPizza implements IPIzza {
    private  int price;
    private String name;
    public int getPrice() {
        return price;
    }

    public ExoticPizza(@Value("#{goodPizza.getPrice()<30 ? 15: 23}") int price,@Value("${nazwa}") String name) {
        this.price = price;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
