package Lab3Algorithms;

import ReadUtils.ReadUtils;

/**
 * Created by Valeria Marc on 12/3/2016.
 */
public class problem1 {

    public static void main (String[] args) {
        System.out.print("Enter number: ");
        int n = ReadUtils.readIntFromConsole();
        int min =1;

        for (int i = min; i<n; i++) {
            if (n%i==0) {
                System.out.println(i);
            }else {}
        }
    }
}
