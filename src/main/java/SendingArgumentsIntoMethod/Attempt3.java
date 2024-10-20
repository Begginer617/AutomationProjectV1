package SendingArgumentsIntoMethod;

public class Attempt3 {


    public static void main(String[] args) {

    int[] y ={5};
    changing(y);


    }
    public static void changing(int[] x){
        x[0] += 5;
        System.out.println("Metoda: " + x[0]);
    }


}



