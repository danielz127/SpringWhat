package pl.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import pl.api.IKucharz;

public class PomocnikKucharza implements IKucharz {
    @Autowired
    @Qualifier("pomocnik_kucharza")
    IKucharz kucharz;
    @Override
    public void pobierzSkladnikiZMagazynu(int liczba) {
        System.out.println("Pomocnik pobiera: "+liczba+ " skladniki");

    }

    @Override
    public void pobierzSkladnikiZMagazynu() {
        System.out.println("Pomocnik pobiera skladniki");

    }

    @Override
    public void przygotujPizze() {
        System.out.println("Pomocnik oddelegowuje przygotowanie pizzy do kucharza");
        kucharz.przygotujPizze();
    }

    @Override
    public void przygotujPizze(int idPizzy) {
        System.out.println("Pomocnik oddelegowuje pizze o id: "+ idPizzy+" do kucharza");
        kucharz.przygotujPizze(idPizzy);

    }

    @Override
    public void wydajPizze() {
        System.out.println("Pomocnik wydaje pizze");
    }
}
