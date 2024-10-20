package JavaConstructor;

public class JavaConstructor {

    public static void main(String[] args) {

        new Punkt(); // rezerwujemy miejsce w pamieci na stwprzenie obiektu.
        Punkt p = new Punkt(10,20);// incijalizujemy i dekalrujemy punkt p dzieki temu mozemy sie do niego odwpływać

        System.out.println("p.x " + p.x);
        System.out.println("p.y " + p.y);
    }


}

// clasa punkt. Co opisuje punkt ? Opisuje wspólrzedne. Ta klasa jest po to by tworzyc instacje klasy = czyli obiektu.
// Inaczej jest to kopia.


class Punkt {
    Punkt(){
        System.out.println("wywołano konstruktor domyślny");
    }

    Punkt(int pierwszy, int drugi){
        System.out.println("Konstruktor z 2 parametrami");

        x = pierwszy;
        y = drugi;

    }
    int x;
    int y;

}








