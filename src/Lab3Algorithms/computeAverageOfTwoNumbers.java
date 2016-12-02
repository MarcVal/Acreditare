package Lab3Algorithms;

import ReadUtils.ReadUtils;

/**
 * Created by Valeria Marc on 12/1/2016.
 */
public class computeAverageOfTwoNumbers {

    public static void main (String[] args) {
        System.out.println("Enter two numbers");
        int a = Integer.valueOf(ReadUtils.readValueFromConsole());
        int b = Integer.valueOf(ReadUtils.readValueFromConsole());
        int sum = a+b;
        int average = sum/2;

        {
            System.out.println("Average of " + a + " and " + b + " is " + average);

        }
    }
}