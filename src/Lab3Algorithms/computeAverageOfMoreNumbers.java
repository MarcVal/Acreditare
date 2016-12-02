package Lab3Algorithms;

import ReadUtils.ReadUtils;

/**
 * Created by Valeria Marc on 12/1/2016.
 */
public class computeAverageOfMoreNumbers {

    public static void main (String[] args) {
        System.out.print("Enter N number of elements" + "for finding average:  ");
        final int elements = Integer.valueOf(ReadUtils.readValueFromConsole());
        System.out.println("");

        int[] numbers = new int[elements];
        int sum = 0;

        for (int i=0; i < elements; i++) {
            System.out.print("Enter number " +(i+1)+ " : " );
            numbers [i] = Integer.valueOf(ReadUtils.readValueFromConsole());
            sum += numbers[i];
        }
        int average = sum / elements;

        System.out.println(" ");
        System.out.println(" Average is " + average);

    }
}
