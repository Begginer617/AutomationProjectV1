package JavaConstructor;

public class CzlowiekTests {

    CzlowiekTests(String imie) {
        this.imie = imie;
        liczebnosc++;
    }

    public String imie;
    static int liczebnosc = 10; // bez static liczebnosc wynosiła by zawsze maksymalnie 1,
    // daltego dodajemy static.
    // Czyli 1 dla całej klasy, a nie dla jednego obiektu.


}


