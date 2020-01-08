package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		Military military = new Military();
		military.printInformation();
		Civil civil = new Civil();
		civil.printInformation();
		Freight freight = new Freight();
		freight.printInformation();
		Passenger passenger = new Passenger();
		passenger.printInformation();
    }
}
