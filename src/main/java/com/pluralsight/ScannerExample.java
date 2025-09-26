package com.pluralsight;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print( "What's Your Name ?");
        String greeting = scanner.nextLine();
        System.out.println("Hi how are you" + greeting);

        System.out.print(" How old are you? ");
        int age = scanner.nextInt();

        System.out.println(" How tall are you in meters? ");
        double height = scanner.nextDouble();
        System.out.print(" You are " + height + "meters" );

        System.out.print(" Do you like Java? (true/false)");
        boolean jave = scanner.nextBoolean();


    }
}
