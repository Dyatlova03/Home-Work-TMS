package com.company;

public class Transport {
    public int power;
    public int speed;
    public int weight;
    public String model;
    public double powerKv;

    public Transport(){
        power = 500;
        speed = 230;
        weight = 2156;
        model = "geg";
        powerKv= power*0.74;
    }

    public void printInformation(){

    }

}
