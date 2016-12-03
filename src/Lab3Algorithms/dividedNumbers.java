package Lab3Algorithms;

import ReadUtils.ReadUtils;
import com.sun.org.apache.xpath.internal.SourceTree;

import static javafx.scene.input.KeyCode.X;

/**
 * Created by Valeria Marc on 12/3/2016.
 */
public class dividedNumbers {
    public static void main(String[] args) {
        System.out.println("Enter number: ");
        int N = ReadUtils.readIntFromConsole();
        int min = 0;
        int max = N;


            // problem 2.a
       /* for (int i = min; i <= 5; i++) {

            if (i % 2 == 1) {
                System.out.println(i + " is an odd number. ");
            } else {
            }


        }
        //problem 2.b
         int r = N%5;
                   if (r!=0){
                System.out.println(r);
            } else {}

       // problem 2.c

        for (int i = min; i <= max; i++) {
             if (i%3==0) {
                 System.out.print(i + ",");
             }else {} */

            // problem 2.d
        int Z = 0;
        for (int X = min; X <= N; X++) {
            if (N % X == 0) {
                System.out.println(X);

            } else {

            }
        }


    }
}