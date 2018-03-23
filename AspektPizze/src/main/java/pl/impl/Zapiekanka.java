package pl.impl;

import pl.api.InterfejsZapiekanka;

public class Zapiekanka implements InterfejsZapiekanka {

    @Override
    public void przygotujZapiekanke() {
        System.out.println("Kucharz przygotowuje zapiekanke");
    }
}
