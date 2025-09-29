package com.pluralsight;

public class Hello {
    public static void main(String[] args) {
        sayHello();
        sayGoodMorning();
        sayGoodBye();
    }

    private static void sayGoodBye() {
        System.out.println(" Good Bye");
    }

    private static void sayHello() {
        System.out.println(" Hello ");
    }

    private static void sayGoodMorning() {
        System.out.println(" Good Morning ");
    }
}
