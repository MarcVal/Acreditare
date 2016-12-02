package Lab2;

import java.util.Scanner;

/**
 * Created by Valeria Marc on 11/21/2016.
 */
public class Lab1 {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println("Username: ");
        // read the username from the console (standard input)
        String Username = new Scanner(System.in).nextLine();
        System.out.println("Welcome " + Username + "!");

        String password="parola12345"; //this is our password.
        System.out.println("Password: ");
        String userPassword = new Scanner(System.in).nextLine();
        if (password.equals(userPassword)) {
            System.out.println("You have access!");
        } else {
            System.out.println("Access denied!");
    }

}}
