package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Daniel Guzman
 */
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        //declare variables and create scanner
        double euros, rate, usd;
        Scanner sc = new Scanner(System.in);

        //prompt user and scan inputs
        System.out.println("How many euros are you exchanging?");
        euros = sc.nextDouble();
        System.out.println("What is the exchange rate?");
        rate = sc.nextDouble();

        //calculations
        usd = rate * euros;
        usd = Math.round(usd*100.0)/100.0;

        //output
        System.out.println((int) euros + " euros at an exchange rate of " + rate + " is " + usd + " U.S. dollars.");

        //close scanner
        sc.close();
    }
}
