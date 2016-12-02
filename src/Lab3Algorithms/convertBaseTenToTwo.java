package Lab3Algorithms;

import ReadUtils.ReadUtils;

/**
 * Created by Valeria Marc on 12/1/2016.
 */
public class convertBaseTenToTwo {

    public static void main(String[] args) {
        System.out.println("Enter a number: ");

        int a = Integer.valueOf(ReadUtils.readValueFromConsole());
        int base10 = a/10;
        int base2 = base10/2;
        for (int i = 0; i < a; ) {
            System.out. println(a + " in base 10 is " + base10);
            System.out.println(base10 + " in base 2 is " + base2);
            break;
        }
    }


}
