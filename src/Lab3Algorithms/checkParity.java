package Lab3Algorithms;

import ReadUtils.ReadUtils;

/**
 * Created by Valeria Marc on 12/3/2016.
 */
public class checkParity {
    public static void main(String[] args) {
        System.out.print("Enter two numbers: ");
        int n = ReadUtils.readIntFromConsole();
        int m = ReadUtils.readIntFromConsole();

        if (n % m == 0) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        boolean x = n % m == 0;
        System.out.println(x);


        int min, max;
        if (n < m) {
            min = n;
            max = m;

        } else {
            min = m;
            max = n;
        }
        for (int i = min; i < max; i++) {
            System.out.println(i + ",");
        }
        System.out.println(max);
    }

    private static void checkParity2(int n, int m) {
        if (n % 2 == 0 && m % 2 == 0) {
            System.out.println("Both numbers are even.");
        } else {
            if (n % 2 == 1 && m % 2 == 1) {
                System.out.println("Both numbers are odd");
            } else {
                System.out.println("One number is even, the other is odd. ");
            }
        }

    }
/*
    public static void checkParity(int n;int m) {
        if (n % 2 == 0) {
            if (m % 2 == 0) {
                System.out.println("Both numbers are even.");
            } else {
                System.out.println("One number is even, the other is odd");
            }
        }else{
                if (m % 2 == 1) {
                    System.out.println("Both numbers are odd.");
                } else {
                    System.out.println("One number is even the other is not.");
                }
            }
        }*/
    }
