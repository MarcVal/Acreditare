package Lab4;

import java.util.Scanner;

/**
 * Created by Valeria Marc on 12/9/2016.
 */
public class Fitness {
    private int index = 0;
    private Person[] persons = new Person[10];

    public void addPerson(Person p) {
        persons[index] = p;
        index++;
    }

    public static void main(String[] args) {
        System.out.println("Welcome!");
        Fitness fitness = new Fitness();
        String option;
        do {
            System.out.println("Menu: ");
            System.out.println("For Create press: c");
            System.out.println("For Print press: p");
            System.out.println("For exit press: x");
            System.out.println("For read press: r");
            option = readStringFromKeyboard();

            switch (option) {
                case "c":
                    fitness.addPerson(createPerson());
                    break;
                case "p":
                    fitness.printPerson();
                    break;
                case "r":
                    fitness.findById(readById());
                    break;
                case "x":
                    System.out.println("Thanks! Stopping.");
                    break;
                default:
                    System.exit(0);
            }

        } while (!"x".equals(option));
    }

    private void findById(int id) {
        boolean found = false;
        for (int i = 0; i < index; i++) {
            if (persons[i].getId() == id) {
                found = true;
                System.out.println(persons[i].print());
            }

        }
        if ((!found)) {
            System.out.println("Person not in fitness app");
        }
    }

    public static int readById() {
        System.out.println("what is the ID?");
        int readId = readIntFromKeyboard();
        return readId;
    }

    private void printPerson() {
        for (int i = 0; i < index; i++) {
            System.out.println(persons[i].print());
        }
    }

    private static Person createPerson() {
        System.out.println("What is the first name?");
        String firstName = readStringFromKeyboard();
        return new Person(firstName);
    }

    public static String readStringFromKeyboard() {
        return new Scanner(System.in).nextLine();
    }

    public static int readIntFromKeyboard() {
        return Integer.valueOf(readIntFromKeyboard());
    }
}

