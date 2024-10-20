package SendingArgumentsIntoMethod;

public class Attempt2 {


    public static void main(String[] args) {

                int lion = 5;
                lion = changeY(lion); // 5+5=10 wystetona jako 1 w terminalu
                System.out.println(lion); //10 wysietla jako 2 wartosc w terminalu

            }

            public static int changeY(int x) {
                x += 5;
                System.out.println("Method: " + x);
                return x;
            }

        }



