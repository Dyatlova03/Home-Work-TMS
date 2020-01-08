package com.company;

import java.util.Scanner;

public class Freight extends Ground {
    public int bearingCapacity;
    public int cargo;
    Ground ground = new Ground();

    public Freight() {
        bearingCapacity = 1000;
    }

    public void printInformation(){
        System.out.println(power + "\n" + speed + "\n" + weight + "\n" + model + "\n" + powerKv + "\n"
                + wheels + "\n" + consumption + "\n" + bearingCapacity);
    }

    public void setBearingCapacity(int bearingCapacity){
        Scanner scanner = new Scanner(System.in);
        cargo = scanner.nextInt();
        if(cargo<=bearingCapacity){
            System.out.println("Truck loaded");
        } else {
            System.out.println("You need a bigger truck");
        }
    }

}
