package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main task = new Main();
        task.parity();
        task.capacity();
        task.sign();
        task.triangle();
        task.wholeNumber();
        task.positiveNumbers();
        task.negativeNumbers();
        task.maxNumber();
        task.programmer();

        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();

        Random random = new Random();
        int j = random.nextInt(100);


    }

    int number = 53;
    int a = 3;
    int b = -6;
    int c = 5;

    public void parity() {

        if ((number % 2) == 0) {
            System.out.print(number + " - Even,");
        } else {
            System.out.print(number + " - Odd");
        }
    }

    public void capacity() {
        int s;
        if (number >= 0 && number <= 9) {
            s = 0;
        } else if (number >= 10 && number <= 99) {
            s = 1;
        } else {
            s = 2;
        }
        switch (s) {
            case 0:
                System.out.println("single digit.");
                break;
            case 1:
                System.out.println(" double digit.");
                break;
            case 2:
                System.out.println(" three-digit number.");
                break;
            default:
                System.out.println("This number is more than a three-digit number.");
        }
    }

    public void sign() {
        if (number < 0) {
            System.out.println("Negative number.");
        } else if(number !=0 ) {
            System.out.println("Positive number.");
        }
    }

    public void triangle() {
        if ((c < a + b) && (b < a + c) && (a < b + c)) {
            System.out.println("The triangle is right.");
        } else {
            System.out.println("The triangle is wrong.");
        }

    }

    public void wholeNumber() {
        if (number > 0) {
            number++;
        } else if (number != 0) {
            number = number - 2;
        } else {
            number = 10;
        }

        System.out.println(number);
    }

    public void positiveNumbers() {
        int quantity = 0;
        if (a > 0) {
            quantity++;
        }
        if (b > 0) {
            quantity++;
        }
        if (c > 0) {
            quantity++;
        }
        System.out.println("Quantity of positive numbers: " + quantity);
    }

    public void negativeNumbers() {
        int quantity = 0;
        if (a < 0) {
            quantity++;
        }
        if (b < 0) {
            quantity++;
        }
        if (c < 0) {
            quantity++;
        }

        System.out.println("Quantity of negative numbers: " + quantity);
    }

    public void maxNumber() {
        if (a > b) {
            System.out.println("Max number is: " + a);
        } else {
            System.out.println("Max number is: " + b);
        }
    }

    public void programmer() {
        int t = number%100;


        if (t >= 11 && number <= 14) {
            System.out.println(number + " програмистов");
        } else {
        switch (number%10) {
            case 1:
                System.out.println(number + " програмист");
                break;

            case 2:
            case 3:
            case 4:
                System.out.println(number + " програмиста");
                break;

            default:
                System.out.println(number + " програмистов");
            }
        }
    }
}
