package pl.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import pl.api.IKucharz;
import pl.api.InterfejsZapiekanka;
import pl.aspects.AspektZapiekanka;
import pl.aspects.Komunikacja;
import pl.aspects.KontrolaMagazynu;
import pl.impl.Kucharz;
import pl.impl.PomocnikKucharza;
import pl.impl.Zapiekanka;

@Configuration
@EnableAspectJAutoProxy
public class AppConfig {
    @Bean
    @Qualifier("kucharz")
    IKucharz kucharz() {
        return new Kucharz();
    }

    @Bean
    Komunikacja komunikacja() {
        return new Komunikacja();
    }

    @Bean
    InterfejsZapiekanka zapiekanka() {
        return new Zapiekanka();
    }

    @Bean
    AspektZapiekanka aspektZapiekanka() {
        return new AspektZapiekanka();
    }

    @Bean
    @Qualifier("pomocnik_kucharza")
    PomocnikKucharza pomocnikKucharza() {
        return new PomocnikKucharza();
    }

    @Bean
    KontrolaMagazynu kontrolaMagazynu() {
        return new KontrolaMagazynu();
    }
}
