package Lab3Algorithms;

import ReadUtils.ReadUtils;

/**
 * Created by Valeria Marc on 12/1/2016.
 */
public class convertFToC {
    public static void main(String[] args) {
        int f = Integer.valueOf(ReadUtils.readValueFromConsole());


        double c = convertFToC(f);

        for(int i = 0; i < f; i += 10 ) {
            System.out.println("F" + i + " in C " + convertFToC(i));
        }
        System.out.println(f + " in celsius " + c);

    }

    public static double convertFToC(int f) {
        return 5.0/9 * (f - 32);
    }
}

