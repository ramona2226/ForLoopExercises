package org.fasttrackit;

import java.util.Scanner;

public class ForExercises {

    public static void main(String[] args) {


        int i;


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the i value");
        i = scanner.nextInt();


        for (i = 1; i <= 100; i++) {
            System.out.println(i);


        }

        exerciseTwo();

        exerciseThree();

        exerciseFour();

        exerciseFive();

         exerciseSix();

         exerciseSeven();

         exerciseEight();

         exerciseNine();
    }

    // ex 2.
    private static void exerciseTwo() {

        int j;

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Please enter the j value");
        j = scanner1.nextInt();

        for (j = 0; j >= -100; j--) {
            System.out.println(j);

        }

    }


    // ex. 3
    private static void exerciseThree() {
        int x;
        int y;

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Please enter the value x ");
        x = scanner2.nextInt();

        System.out.println("Please enter the value y");
        y = scanner2.nextInt();

        for (int i = x; i < y; i++) {
            System.out.println(i);
        }

    }

    // ex. 4

    private static void exerciseFour() {
        int a;
        int b;

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Please enter the value a ");
        a = scanner2.nextInt();

        System.out.println("Please enter the value b");
        b = scanner2.nextInt();

        for (int i = 0; i < a; i++) {
            if (a > b) {
                System.out.println(i + b);
            }


        }
    }

// ex. 5

    private static void exerciseFive() {
        // define limit
        int limit = 100;

        System.out.println("Printing even numbers between 1  and" + " " + limit);
        for (int i = 1; i <= limit; i++) {

            //if the number in divisible by 2 then it is even
            if (i % 2 == 0) {

                System.out.println(i + " ");


            }
        }
    }
// ex. 6

    private static void exerciseSix() {
        int limit = 100;

        System.out.println("Printing odd numbers between 1  and" + limit);

        for (int i = 1; i <= limit; i++) {

            //if the number in not divisible by 2 then it is odd
            if (i % 2 != 0) {

                System.out.println(i + " ");
            }

        }
    }
    // ex. 7

    public static void exerciseSeven() {
        int n;
        Scanner scanner5 = new Scanner(System.in);
        System.out.println("Enter n:");
        n = scanner5.nextInt(); // ii dau valoarea lui n 100


        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;

        }
        System.out.println("Sum = " + sum);

    }


    // ex. 8
    private static void exerciseEight() {

        double ma;
        int n;
        Scanner scanner8 = new Scanner(System.in);
        System.out.println("Enter n:");
        n = scanner8.nextInt(); // ii dau valoarea lui n 100


        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;

        }
        System.out.println("Sum = " + sum);


        ma = sum / n;

        System.out.println("Media aritmetica = " + ma);


    }



// ex 9.

    public static void exerciseNine() {
        int x;
        Scanner scanner =  new Scanner(System.in);
        System.out.println(" Enter number x:");
        x = scanner.nextInt();

        for(int i = 1; i <= x; i++){
            for(int j = x; j >= i; j--){
                System.out.print(" * ");
            }
            System.out.println();// new line
        }
    }
}



