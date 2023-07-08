package com.mycompany.ref1;

import java.util.Scanner;

public class Ref1 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Type your name");
        String name = scanner.nextLine();
        
        System.out.println("How old are you?");
        int age = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("What animal do you identify with?");
        String animal = scanner.nextLine();
        
        System.out.println("Hello "+name);
        System.out.println("Great!");
        System.out.println("Very well! We'll be in touch with you later to inform you about your results.");
        
        
        
        
    }
}
