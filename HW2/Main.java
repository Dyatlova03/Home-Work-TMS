package com.company;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.first();
        main.second();
        main.third();
        main.fourth();
        main.fifth();
        main.sixth();
        main.seventh();
        main.eighth();
    }

    public void first() {
        double d = 10;
        double proc;
        double sum = 0;
        for (int i = 1; i < 8; i++) {
            sum += d;
            proc = d / 10;
            d = d + proc;
        }
//        System.out.printf("%.2f", sum + "km");
    }

    public void second() {
        int a = 1;
        for (int i = 3; i < 25; i += 3) {
            System.out.println(a);

            a *= 2;
        }
    }

    public void third() {
        int i = 1;
        int sum = 1;
        while (i < 256) {
            System.out.print(i + "+");
            i += i;
            sum += i;
        }
        System.out.print(i);
        System.out.println(" = " + sum);
    }

    public void fourth() {
        int c = 4;
        int d = 3;
        int answer = 0;
        for (int i = 1; i <= c; i++) {
            answer += d;
        }
        System.out.println(answer);
    }

    public void fifth() {
        double d = 2.54;
        double a = 0;
        for (int i = 1; i < 20; i++) {
            System.out.println(i + "inch = " + a + "cm");
            a = d + a;
        }
    }

    public void sixth() {

        for (int i = 2; i <= 100; i += 2) {
            System.out.println(i);
        }
    }

    public void seventh() {
        int sum = 0;
        for (int i = 1; i < 100; i += 2) {
            sum += i;
        }
        System.out.println(sum);
    }

    public void eighth() {
        int c = 1;
        int f = 5;
        int d = 5;
        while (d != 0) {
            for (int i = 1; i < d; i++) {
                System.out.print(" ");
                for (int j = 0; j < d - (d - 1); j++) {
                    System.out.print("* ");
                }
                System.out.println();
                d--;
            }
        }
    }
}