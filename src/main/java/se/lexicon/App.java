package se.lexicon;

import java.util.Scanner;


public class App {

    public static void main(String[] args) {
        // get input from console
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your username: ");
        // get string from console
        String username = scanner.nextLine();
        // print message
        System.out.println("Hello " + username );
    }
}