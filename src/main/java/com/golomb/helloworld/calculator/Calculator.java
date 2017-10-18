package com.golomb.calculator;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        System.out.println("Hello");

        Scanner Scan = new Scanner(System.in);

        System.out.println("Please enter number one and number two");
        double n1;
        double n2;
        System.out.println("Please enter first number");
        n1 = Scan.nextInt();
        System.out.println("Please enter second number");
        n2 = Scan.nextInt();

        System.out.println("Select between (*,/,+,-):");
        String Operation = Scan.next();
        String n1n2 = "Thank you for your selection";

                switch (Operation) {
                    case "*": System.out.println(n1n2 + "* \n Your Result: "+( n1 * n2 )); break;
                    case "/": System.out.println(n1n2 + "/ \n Your Result: "+ ( n1 / n2 )); break;
                    case "+": System.out.println(n1n2 + "+ \n Your Result: "+ ( n1 + n2 ));break;
                    case "-": System.out.println(n1n2 + "- \n Your Result: "+( n1 - n2 )); break;
                    default: System.out.println("\n Please select a valid character"); }

        Scan.close();
        System.out.println(" Application is closed ");
    }
}
