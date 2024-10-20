package JavaMethods;

public class JavaMethods {
    public static void main(String[] args) {
        Car kia = new Car();
        boolean isColourBlack = kia.changeColour("Black");
        System.out.println(isColourBlack);
        kia.breaking();
        kia.driving();

        Car bmw = new Car();
        boolean isColourRed = bmw.isColourRed("RED");
        System.out.println(isColourBlack);
        kia.breaking();
        kia.driving();


    }
}
