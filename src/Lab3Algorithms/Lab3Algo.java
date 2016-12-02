package Lab3Algorithms;

import java.util.Scanner;

/**
 * Created by Valeria Marc on 11/22/2016.
 */
public class Lab3Algo {

   public static void loginUser() {
        System.out.println("Username: ");
    String username = readValueFromConsole();
        System.out.println("Welcome " + username + "!!!");
    String password = "parola";
        System.out.println("Password:");
    String userPassword = readValueFromConsole();
    int counter = 1;
    int max = 8;
    boolean isValid;
        do {
        System.out.println("Password:");
        userPassword = readValueFromConsole();
        if (counter >= 8) {
            System.out.println("Ai epuizat numarul de incercari permise!");
            System.exit(0);
        }
        isValid = password.equals(userPassword);
        if (isValid) {
            System.out.println("You have access!");
            System.out.println("Ai reusit sa ghicesti parola din doar  " + counter + " incercari gresite!");

            System.exit(0);
        } else {
            counter = counter +1;
            System.out.println("Access denied after " + counter + " attempts.");
        }
    }
        while (!isValid && counter < max);    }




    private static String readValueFromConsole() {
        {
            return new Scanner(System.in).nextLine();
        }
    }
}

