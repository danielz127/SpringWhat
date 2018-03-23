package pl.api;

public interface IKucharz {
    void pobierzSkladnikiZMagazynu(int liczba);
    void pobierzSkladnikiZMagazynu();
    void przygotujPizze();
    void przygotujPizze(int idPizzy);
    void wydajPizze();


}
