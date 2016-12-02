package Lab3Algorithms;

import ReadUtils.ReadUtils;
import com.sun.imageio.plugins.common.ReaderUtil;

/**
 * Created by Valeria Marc on 11/30/2016.
 */
public class addTwoNumbersOneByOne {

    public static void main (String[] args) {
        System.out.println("Enter 2 numbers: ");
        int a = Integer.valueOf(ReadUtils.readValueFromConsole ());
        int b = Integer.valueOf(ReadUtils.readValueFromConsole());

        int max;
        int min;

        if (a < b) {
            max = b;
            min = a;
        }else  {
            max = a;
            min = b;
        }
        int sum = max;
        for (int i = 0; i < min; i++) {
            sum = sum + 1;
        }

        System.out.println (a + " + " + b + " = " + sum);
    }
}
