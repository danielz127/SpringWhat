package pl.impl;

import pl.api.IKucharz;

import java.util.concurrent.ExecutionException;

public class Kucharz implements IKucharz {
    @Override
    public void pobierzSkladnikiZMagazynu(int liczbaSkladnikow) {
        System.out.println("Kucharz pobiera: "+liczbaSkladnikow+ " skladniki");
//        throw new IllegalArgumentException();
    }

    @Override
    public void pobierzSkladnikiZMagazynu() {
        System.out.println("Kucharz pobiera skladniki");
    }

    @Override
    public void przygotujPizze() {
        System.out.println("Kucharz przygotowuje pizze");
    }

    @Override
    public void przygotujPizze(int idPizzy) {
        System.out.println("Kucharz pobiera pizze o id: "+idPizzy);

    }


    @Override
    public void wydajPizze() {
        System.out.println("Kucharz wydaje pizze");
    }
}
