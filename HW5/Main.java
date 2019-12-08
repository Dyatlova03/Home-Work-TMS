package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Computer computer = new Computer();

        computer.printInformation();
        computer.limit();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 0 or 1 :");
        computer.turnOnOff = scanner.nextInt();
        computer.turnOnTheComputer(computer.turnOnOff);
        System.out.println("Turn on the computer again?"+"\n"+"1 for 'yes' and 2 for 'no' ");
        computer.choice = scanner.nextInt();
        if(computer.choice == 1){
            System.out.println("Enter 0 or 1 :");
            computer.turnOnOff = scanner.nextInt();
            computer.turnOnTheComputer(computer.turnOnOff);
        } else {
            System.exit(0);
        }
    }

}
