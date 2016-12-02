package Lab3Algorithms;

import ReadUtils.ReadUtils;

/**
 * Created by Valeria Marc on 12/2/2016.
 */
public class primeNumbers {

    public static void main(String[] args) {

        int n = Integer.valueOf(ReadUtils.readValueFromConsole());
        for (int i = 0; i < n; i += 1) {
            int m = 0, flag = 0;
            m = n / 2;
            int j;
            for (j = 2; j <= m; j++) {
                if (n % j == 0) {
                    System.out.println(i+ "Number is not prime");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0)
                System.out.println("Number is prime");
        }
    }
}



