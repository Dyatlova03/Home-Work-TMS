package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    Random r = new Random();

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
        main.ninth();
        main.ten();
    }

    public void first() {
        int k = 0;
        int[] s = new int[10];
        for (int i = 0; i < 10; i++) {
            k += 2;
            s[i] = k;
            System.out.print(s[i] + " ");
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("\n" + s[i]);
        }
    }

    public void second() {
        int[] mas = new int[50];
        int k = 1;
        for (int i = 0; i < 50; i++) {
            mas[i] = k;
            k += 2;
            System.out.print(mas[i] + " ");
        }
        System.out.println();
        for (int i = 49; i >= 0; i--) {
            System.out.print(mas[i] + " ");
        }

        System.out.println();
    }

    public void third(){
        int[] third = new int[15];
        int count=0;
        for (int i=0; i<15; i++){
            third[i]=r.nextInt(100);
            System.out.print(third[i] + " ");
        }
        for (int i=0; i<15; i++){
            if (third[i]%2==0){
                ++count;
            }
        }
        System.out.println("\n" + "The number of even elements of the array is " + count + ".");
    }

    public void fourth(){
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = r.nextInt(20);
            System.out.print(array[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0) {
                System.out.print(array[i] + " ");
            } else {
                array[i] = 0;
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }

    public void fifth(){
        int n=5;
        int[] array1 = new int[n];
        int[] array2 = new int[n];
        int s1=1;

        for (int i = 0; i < 5; i++) {
            array1[i] = r.nextInt(10);
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            array2[i] = r.nextInt(10);
            System.out.print(array2[i] + " ");
        }
        System.out.println();

        for (int i=0; i<5; i++){
            s1*=array1[i];
        }
        s1/=n;
        System.out.println(s1);

        int s2=1;
        for (int i=0; i<5; i++){
            s2*=array2[i];
        }
        s2/=n;
        System.out.println(s2);

        if(s1>s2) {
            System.out.println("The product of the first array is larger.");
        }
        if (s1<s2) {
            System.out.println("The product of the second array is larger.");
        } else {
            System.out.println("Products of arrays are equal.");
        }
    }

    public void sixth(){
        int[] array = new int[4];
        int res=0;


        for (int i = 0; i < 4; i++) {
            array[i] = r.nextInt(10);
            System.out.print(array[i] + " ");
        }

        System.out.println();
        for (int i=1; i<4; i++){
           if(array[i]<= array[i-1]){
              res=0;
              break;
           } else {
               res=1;
           }
        }
        if(res == 1) {
            System.out.println("An array is a strictly increasing sequence.");
        } else {
            System.out.println("An array isn't a strictly increasing sequence.");
        }
    }

    public void seventh(){
        int[] array = new int[12];
        int max=0;
        int s=0;

        for (int i = 0; i < 12; i++) {
            array[i] = r.nextInt(16);
            System.out.print(array[i] + " ");
        }

        System.out.println();
        for (int i=0; i<12; i++) {
            if(array[i]>max){
                max=array[i];
                s=i;
            }
        }
        System.out.println("The maximum number is: " + max + " with index " + s + ".");
    }

    public void eighth (){
        double[] array1 = new double[10];
        double[] array2 = new double[10];
        double[] array3 = new double[10];

        for (int i = 0; i < 10; i++) {
            array1[i] = r.nextInt(10);
            System.out.print(array1[i] + "  ");
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            array2[i] = r.nextInt(10);
            System.out.print(array2[i] + "  ");
        }
        int count=0;
        System.out.println();
        for (int i=0; i<10; i++) {
            array3[i]= array1[i]/array2[i];
            if (array1[i]%array2[i]==0){
                count++;
            }
            System.out.print(array3[i] + "  ");
        }
        System.out.println("\n" + "Array has " + count + " integers.");
    }

    public void ninth(){

        int sum1=0;
        int sum2=0;

        System.out.println("Enter the size of the array: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n<0){
            System.out.println("Wrong number!!"+"\n"+ "Try it again: ");
            n = scanner.nextInt();
        }
                    int[] array = new int [n];
            for (int i = 0; i < n; i++) {
                array[i] = r.nextInt(16);
                System.out.print(array[i] + " ");
            }
            System.out.println();

            if(n%2==0){
                for(int i=0; i<n/2; i++){
                    sum1+=array[i];
                }
                for (int i = n/2; i < n; i++) {
                    sum2+=array[i];
                }

                System.out.println("The sum of the left side = " + sum1 + "." + "\n" + "The sum of the right side = " +  sum2 + ".");
                if(sum1>sum2){
                    System.out.println("The sum of the left side is greater." );
                 if(sum1==sum2){
                        System.out.println("The sum of the modules are equal.");
                }
                }else {
                    System.out.println("The sum of the right side is greater.");
                }
            } else{
                System.out.println("The array isn't divided into two parts.");
            }
    }

    public void ten(){
        System.out.println("\n"+"Enter a number more than 3.");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n<3){
            System.out.println("Wrong number!!"+"\n"+ "Try it again: ");
            n = scanner.nextInt();
        }
        int[] array1 = new int [n];
        int[] array2 = new int [n];
        for (int i = 0; i < n; i++) {
            array1[i] = r.nextInt(n+1);
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            if(array1[i]%2==0) {
                array2[i]=array1[i];
                System.out.print(array2[i] + " ");
            }
        }
    }
}
