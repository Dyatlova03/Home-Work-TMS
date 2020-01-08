package com.company;

public class Military extends Air {
    public boolean catapult;
    public int numberOfMissiles;

    public Military(){
        catapult = true;
        numberOfMissiles = 10;
    }

    public void printInformation(){
        System.out.println(power + "\n" + speed + "\n" + weight + "\n" + model + "\n" + powerKv + "\n"
                + wingspan + "\n" + runwayStrip + "\n" + catapult + "\n" + numberOfMissiles);
    }

    public void missiles(){
        if(numberOfMissiles != 0){
            System.out.println("The missile went!");
            numberOfMissiles--;
        } else {
            System.out.println("No ammunition.");
        }
    }

    public void catapult(boolean catapult){
        if(catapult){
            System.out.println("Catapult was successful!");
        } else {
            System.out.println("You don't have such a system.");
        }
    }
}
