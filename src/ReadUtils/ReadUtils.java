package ReadUtils;

import com.sun.org.apache.xalan.internal.xsltc.runtime.Operators;

import java.util.Scanner;

/**
 * Created by Valeria Marc on 11/30/2016.
 */
public class ReadUtils {

    public static Integer readIntFromConsole() {
        return new Scanner(System.in).nextInt();
    }

    public static String readValueFromConsole() {

            return new Scanner(System.in).nextLine();
        }
public static String readStringFromConsole() {return new Scanner(System.in).nextLine();}
}



