package com.company;

import java.util.Scanner;

public class Passenger extends Ground {
    public String bodyType;
    public int numberOfPassengers;
    Ground ground = new Ground();

    public Passenger(){
        bodyType = "Hatchback";
        numberOfPassengers = 5;
    }

    public void printInformation(){
        System.out.println(power + "\n" + speed + "\n" + weight + "\n" + model + "\n" + powerKv + "\n"
                + wheels + "\n" + consumption + "\n" + bodyType + "\n" + numberOfPassengers);
        power();
    }

private void power(){

    System.out.println("Enter time ");
    Scanner scanner = new Scanner(System.in);
    double time = scanner.nextDouble();
    double way = speed*time;
    System.out.println("За время " + time + " автомобиль " + model + " двигаясь с максимальной скоростью " + speed + "км/ч проедет "
            + way + " и израсходует " + way*(consumption/100)  + " литров топлива");
}
}
