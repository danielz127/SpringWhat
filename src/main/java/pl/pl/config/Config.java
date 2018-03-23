package pl.pl.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.api.IPIzza;
import pl.impementation.ExoticPizza;
import pl.impementation.GoodPizza;
import pl.impementation.Order;

@Configuration
public class Config {


    @Bean
    public IPIzza pizza(){
        return new ExoticPizza(25,"Egzotyczna");
    };
    @Bean
    public Order order(IPIzza ipIzza){
        return new Order(ipIzza);
    }
}
