package ReadUtils;

import ReadUtils.ReadUtils;

import java.util.Scanner;

/**
 * Created by Valeria Marc on 11/22/2016.
 */
public class ReadNumber {

    public static void main(String[] args) {

        int number = Integer.valueOf(readIntFromConsole());
        System.out.println(number);
        if (number < 0) {
            System.out.println("Negative");
        } else {
            int pow = number * number;
            System.out.println(pow);
        }


        int a = Integer.valueOf(ReadUtils.readValueFromConsole());
        int b = Integer.valueOf(ReadUtils.readValueFromConsole());

        int max;
        int min;
        if (a<b)

       // int sum = b;
        for (int i=0; i<a; i++);
       // sum = sum +1;
        System.out.println(a + "+" + b + "=" + "sum");}


   public static Integer readIntFromConsole() {
        return new Scanner(System.in).nextInt();
    }

    public static String readValueFromConsole() {
        {
            return new Scanner(System.in).nextLine();
        }
    }
}
