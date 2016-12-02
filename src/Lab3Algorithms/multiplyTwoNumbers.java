package Lab3Algorithms;

import ReadUtils.ReadUtils;

/**
 * Created by Valeria Marc on 11/30/2016.
 */
public class multiplyTwoNumbers {
    public static void main(String[] args) {
        System.out.println("Enter two numbers to be multiplied: ");


    int a = Integer.valueOf(ReadUtils.readValueFromConsole());
    int b = Integer.valueOf(ReadUtils.readValueFromConsole());
    int max;
    int min;
    if(a < b) {
        max = b;
        min = a;
    }else {
        max = a;
        min = b;
    } int product = 0;
        for (int i = 0; i<min; i++) {
            product = product + max;
            System.out.println(product);
        }
        System.out.println(a + "*" + b + "=" + product);
}}
