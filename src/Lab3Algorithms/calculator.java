package Lab3Algorithms;

import ReadUtils.ReadUtils;
import com.sun.org.apache.xalan.internal.xsltc.compiler.util.ObjectType;
import com.sun.org.apache.xalan.internal.xsltc.runtime.Operators;
import com.sun.org.apache.xpath.internal.operations.String;
import com.sun.xml.internal.ws.wsdl.writer.document.Operation;

/**
 * Created by Valeria Marc on 12/2/2016.
 */
public class calculator {
   /* public static void main(String[] args) {
        System.out.println("Enter operation of two numbers:");
        String firstNumber = args[0];
        int a = Integer.parseInt(java.lang.String.valueOf(firstNumber));
        String operator = args[1];
        String secondNumber = args[3];
        int b = Integer.parseInt(java.lang.String.valueOf(secondNumber));
        if ((operator == +) || (operator"-") || operator.equals("*") || operator.equals("%") || operator.equals("/")) {
            if (operator.equals("+")) {
                System.out.println("Result is: " + (a + b));
            } else if (operator.equals("-")) {
                System.out.println("Result is: " + (a - b));
            } else if (operator.equals("/")) {
                System.out.println("Result is: " + (a / b));
            } else if (operator.equals("*")) {
                System.out.println("Result is: " + (a * b));
            } else if (operator.equals("%")) {
                System.out.println("Result is: " + (a % b));
            } else {
                System.out.println("Please introduce the required type input");
            }
        } else {
            System.out.println("You introduced a wrong type of operator. Try again!");
        }
    } */
   public static void main(java.lang.String[] args) {
       System.out.println("Enter firstNumber: ");
       int a = Integer.valueOf(ReadUtils.readValueFromConsole());
       System.out.println("Enter operator ");
       java.lang.String operator = ReadUtils.readValueFromConsole();
       System.out.println("Enter secondNumber");
       int b = Integer.valueOf(ReadUtils.readValueFromConsole());
       if (operator.equals("+")) {
           System.out.println("Result is: " + (a + b));
       } else if (operator.equals("-")) {
           System.out.println("Result is: " + (a - b));
       } else if (operator.equals("/")) {
           System.out.println("Result is: " + (a / b));
       } else if (operator.equals("*")) {
           System.out.println("Result is: " + (a * b));
       } else if (operator.equals("%")) {
           System.out.println("Result is: " + (a % b));
       } else {
           System.out.println("Please introduce the required type input");
       }
   }

}


