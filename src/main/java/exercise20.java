/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Rachel Cameron
 */

import java.util.Scanner;

public class exercise20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the order amount?");
        double orderamount = input.nextDouble();
        System.out.println("What is the state?");
        String state = input.next();
        System.out.println("What is the county?");
        String county = input.next();
        double wiTax = .055;
        double ilTax = .08;
        if(state.equalsIgnoreCase("WI")) {
            if(county.equalsIgnoreCase("Eau Claire")){
                wiTax = wiTax + .05;
                System.out.printf("The subtotal is $%.2f\nThe tax is $%.2f\nThe total is $%.2f\n", orderamount, orderamount * wiTax, orderamount + (orderamount * wiTax));
            }
            else if(county.equalsIgnoreCase("Dunn")){
                wiTax = wiTax + .04;
                System.out.printf("The subtotal is $%.2f\nThe tax is $%.2f\nThe total is $%.2f\n", orderamount, orderamount * wiTax, orderamount + (orderamount * wiTax));
            }
            else{
                System.out.printf("The subtotal is $%.2f\nThe tax is $%.2f\nThe total is $%.2f\n", orderamount, orderamount * wiTax, orderamount + (orderamount * wiTax));
            }
        }
        else if(state.equalsIgnoreCase("IL")) {
            System.out.printf("The subtotal is $%.2f\nThe tax is $%.2f\nThe total is $%.2f\n", orderamount, orderamount * ilTax, orderamount + (orderamount * ilTax));
        }
        else{
            System.out.printf("The subtotal is $%.2f\nThe tax is $0.00\nThe total is $%.2f\n", orderamount, orderamount);
        }
    }
}