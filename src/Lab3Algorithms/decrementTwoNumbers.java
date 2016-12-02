package Lab3Algorithms;

import ReadUtils.ReadUtils;
import com.sun.imageio.plugins.common.ReaderUtil;
import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by Valeria Marc on 11/30/2016.
 */
public class decrementTwoNumbers {

    public static void main (String[] args) {
        System.out.println("Enter two numbers: ");
        int a = Integer.valueOf(ReadUtils.readValueFromConsole());
        int b = Integer.valueOf(ReadUtils.readValueFromConsole());

        int diff = a;

        for(int i=0; i<b; i++) {
            diff = diff -1;
        }
        System.out.println(a+"-"+b + "=" + diff);
    }

}
