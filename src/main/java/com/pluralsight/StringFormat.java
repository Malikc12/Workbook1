package com.pluralsight;

public class StringFormat {
    public static void main(String[] args) {
        String name = "Alice";
        int age = 25;
        double gpa = 3.6789;

        // Step 1
        String message1 = " Name: " +  name;
        System.out.println(message1);

        //Step 2
        String message2 = "age";
        System.out.printf(" Age: %d. " , age );

        //Step 3
        String message3 = "gpa";
        System.out.printf(" GPA: %.2f " , gpa);

        //Step 4
        String message4 = String.format(" Name: %s , Age: %d , GPA: %.2f" , name , age , gpa);

        //Step 5
        System.out.printf(" Name: %s , Age: %d , GPA: %.2f" , name , age , gpa);
    }
}
