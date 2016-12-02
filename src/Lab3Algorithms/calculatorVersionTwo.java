package Lab3Algorithms;

/**
 * Created by Valeria Marc on 12/2/2016.
 */
public class calculatorVersionTwo {
    public static void main(String[] args) {
        System.out.print("Your args are = ");
        for (String arg : args)
            System.out.print(arg + " ");
        System.out.println();

        if (args.length == 3) {

            String firstNumber = args[0];
            float a = Float.parseFloat(firstNumber);

            String secondNumber = args[2];
            float b = Float.parseFloat(secondNumber);

            String operator = args[1];


            if (operator.equals("+")) {
                System.out.println("Result is: " + (a + b));
            } else if (operator.equals("-")) {
                System.out.println("Result is: " + (a - b));
            } else if (operator.equals("/")) {
                System.out.println("Result is: " + (a / b));
            } else if (operator.equals("*"))//the user input must be "*" for the cmd to read this special character
            {
                System.out.println("Result is: " + (a * b));
            } else if (operator.equals("%")) {
                System.out.println("Result is: " + (a % b));
            }
        } else {
            System.err.println("3 args are needed!");
        }

    }

}