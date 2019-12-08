package com.company;

import java.util.Random;
import java.util.Scanner;

public class Computer {
    public String processor;
    public int ram;
    public int hardDisk;
    public static int work =0;
    public int turnOnOff;
    public int choice = 0;

    public Computer() {
        processor = "Intel Core i5";
        hardDisk = 116000;
        ram = 32;
    }

    public void printInformation(){
        System.out.println(processor);
        System.out.println(ram);
        System.out.println(hardDisk);
    }

    public boolean turnOnTheComputer(int turnOnOff){
        Random r = new Random();
       int s=r.nextInt(2);
        System.out.println(s);
        if(s==turnOnOff) {
            System.out.println("Ok");
            System.out.println("Enter 0 or 1 :");
            Scanner scanner = new Scanner(System.in);
            turnOnOff = scanner.nextInt();
            turnOffTheComputer(turnOnOff);
        } else {
            System.out.println("Sorry" + "\n" + "Computer is dead.");
        }
        work++;
        return s==turnOnOff;
    }
    public void turnOffTheComputer(int turnOnOff){
        Random r = new Random();
        int s=r.nextInt(2);
        System.out.println(s);
        if(s==turnOnOff) {
            System.out.println("Ok");
        } else {
            System.out.println("Sorry" + "\n" + "Computer is dead.");
        }
        work++;
    }

    public void limit(){
        if(work>10){
            System.out.println("Sorry" + "\n" + "Computer is dead.");
        }
    }
}
