package com.company;

public class Civil extends Air {
    public int numberOfPassengers;
    public boolean businessClass;

    public Civil(){
        numberOfPassengers = 100;
        businessClass = true;
    }

    public void printInformation(){
        System.out.println(power + "\n" + speed + "\n" + weight + "\n" + model + "\n" + powerKv + "\n"
                + wingspan + "\n" + runwayStrip + "\n" + businessClass + "\n" + numberOfPassengers);
    }

    public void setNumberOfPassengers(int numberOfPassengers){
        if(this.numberOfPassengers < numberOfPassengers){
            System.out.println("Plane loaded.");
        } else {
            System.out.println("You need a bigger plane");
        }
    }
}
