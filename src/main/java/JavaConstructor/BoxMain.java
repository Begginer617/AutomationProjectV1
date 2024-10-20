package JavaConstructor;

import io.cucumber.core.cli.Main;

import static java.lang.System.out;



public class BoxMain {


    private int lenght;
    private int weight;
    private int height;
    private int width;
    private boolean isPackedAndSend = true;
    private boolean isNotPackedAndNotSend = false;

    // konstruktor z parametrami
    public BoxMain(int dlugosc , int szerokosc , int wysokosc , int ciezar , boolean statusWysylki) {

        this.lenght = dlugosc;
        this.width = szerokosc;
        this.height = wysokosc;
        this.weight = ciezar;
        this.isPackedAndSend = statusWysylki;
        this.isNotPackedAndNotSend = statusWysylki;

    }
    // konstruktor domyslny
    public BoxMain(){
    }

    public void showAllFieldsOfClass() {
        out.println( "Pokaz domyslne wartosci  " + height + lenght + width + weight + isPackedAndSend + isNotPackedAndNotSend );
    }


    public void printLength(int length) {
        out.println( "dlugosc pudelka to: " + length );
    }

    public void printWeight(int weight) {
        out.println( "Ciezar pudeło to: " + weight );
    }

    public void printHeight(int height) {
        out.println( "Wysokosc pudeło to: " + height );

    }   public void printWidht(int width) {
        out.println( "Wysokosc pudeło to: " + width );

    }

}
