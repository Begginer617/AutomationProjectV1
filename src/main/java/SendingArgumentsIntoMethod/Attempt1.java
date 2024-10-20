package SendingArgumentsIntoMethod;

public class Attempt1 {

    public static void main(String[] args) {

        int frog = 5;
        changeY(frog); // 5+5=10 wystetona jako 1 w terminalu
        System.out.println(frog); //5 wysietla jako 2 wartosc w terminalu


    }

    public static void changeY(int x) {
        x += 5;
        System.out.println("Method: " + x);
    }

}
