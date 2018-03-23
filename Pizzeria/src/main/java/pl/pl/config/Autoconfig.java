package pl.pl.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import pl.api.IPIzza;
import pl.impementation.ExoticPizza;
import pl.impementation.GoodPizza;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan("pl.impementation")

public class Autoconfig {

    @Bean
    public List<IPIzza> listOfPizza() {
        List<IPIzza> listOfPizza = new ArrayList<>();
        listOfPizza.add(new GoodPizza(13, "good"));
        listOfPizza.add(new ExoticPizza(25, "exotic"));
        return listOfPizza;
    }
}
