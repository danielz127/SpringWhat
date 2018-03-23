package pl.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.api.IKucharz;
import pl.api.InterfejsZapiekanka;
import pl.config.AppConfig;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        IKucharz kucharz = (IKucharz) applicationContext.getBean("kucharz");
        kucharz.pobierzSkladnikiZMagazynu(5);
        kucharz.przygotujPizze(1);
        kucharz.wydajPizze();

        IKucharz pomocnik_kucharza = (IKucharz) applicationContext.getBean("pomocnikKucharza");
        pomocnik_kucharza.pobierzSkladnikiZMagazynu(15);

        ((InterfejsZapiekanka)kucharz).przygotujZapiekanke();

    }



}
