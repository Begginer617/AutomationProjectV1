package org.example.loops;

import java.util.Scanner;

public class IfElseLoops {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your age ?");
        Integer userAge = scanner.nextInt();
        System.out.println("you have" + " " + userAge + " years old.");

        System.out.println("What's your name ?");
        String name = scanner.nextLine();
        int outOfScale = 110;


        if (userAge >= 18) {
            System.out.println("You're adult");
            System.out.println("you're minor");
        } else {
             {
                 System.out.println("You're dead");
            }
        }

// && znaczy dodaj || znaczy lub

        if (!name.isEmpty() && !name.endsWith("a") || name.equals("barnaba") || name.equals("Kuba") || name.equals("kosma")) {
            System.out.println("Jestes mezczyzna");
        } else if (!name.isEmpty() && name.endsWith("a")) {
            System.out.println("jestes kobieta");
        } else {
            System.out.println("name cannot be empty");
        }
    }

}
