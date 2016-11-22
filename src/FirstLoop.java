import java.util.Scanner;

/**
 * Created by Valeria Marc on 11/21/2016.
 */
public class FirstLoop {
    public static void main(String[] args) {

        System.out.println("Username: ");
        String username = readValueFromConsole();
        System.out.println("Welcome " + username + "!!!");
        String password = "parola";
        System.out.println("Password:");
        String userPassword = readValueFromConsole();
        int counter = 1;
        boolean isValid;
        do {
            System.out.println("Password:");
            userPassword = readValueFromConsole();
            counter++;
            if (counter >= 8) {
                System.out.println("Ai epuizat numarul de incercari permise!");
                System.exit(0);
            }
            isValid = password.equals(userPassword);
            if (isValid) {
                System.out.println("You have access!");
                System.out.println("Ai reusit sa ghicesti parola din doar " + counter + " incercari!");

                System.exit(0);
            } else {
                System.out.println("Access denied! Attempts " + counter + ".");
            }
        }
        while (!isValid && counter < 8);    }


    private static String readValueFromConsole() {
        {
            return new Scanner(System.in).nextLine();
        }
    }
}