package JavaArrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class JavaArrays {

    // jak tworzyc tablice
    // sluza do przechowywani wielu zmiennych ktore inaczej trzeba byłoby inicjalizowac


    public static void main(String[] args) {
//        int[]numbers = {1,2,3,4,5,6,7,8,9,10,11};
//        String[]animals={"Lion", "Monkey", "Rat", "Wolf", "eagle", "mouse"};
//        System.out.println(animals); /// why ?
//        System.out.println(numbers); // why I see this ?
//        System.out.println(numbers[0]);
//        System.out.println(numbers[1]);
//        System.out.println(numbers[2]);
//        System.out.println(animals[0]);
//        System.out.println(animals[1]);
//        System.out.println(animals[2]);


        // tablica wystetla wyniki tylko do przedostatniej liczby w tablicy np od 0 do 10 wysetli
        // 9, ale 10 juz bedzie wartoscia wyraczajaca zbior
        // tablice zaczynaja sie od wartosci 0
        //chca wiedziec jak dluga jest tablica nalezy uzyc metody .lenght
        // chca wystetwlic wszytkie skladowe tablicy nalezy uzyc petli for
        //


        int[] myNumbers = new int[10];
        myNumbers[0] = 1;
        myNumbers[1] = 2;
        myNumbers[2] = 3;
        myNumbers[3] = 4;
        myNumbers[4] = 5;
        myNumbers[5] = 6;
        myNumbers[6] = 7;

        myNumbers[7] = 8;
        myNumbers[7] = 9;
        myNumbers[7] = 8;

        myNumbers[8] = 9;
        myNumbers[9] = 10;



        System.out.println(myNumbers[0]);
        System.out.println(myNumbers[1]);
        System.out.println(myNumbers[2]);
        System.out.println(myNumbers[3]);
        System.out.println(myNumbers[4]);
        System.out.println(myNumbers[5]);
        System.out.println(myNumbers.length);

        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println(myNumbers[i]);
        }


    }

}

