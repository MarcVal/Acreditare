package OtherProblems;

import ReadUtils.ReadUtils;

/**
 * Created by Valeria Marc on 12/9/2016.
 */
public class Rectangle {
    public static void main(String[] args) {
        System.out.println("Enter length");
        double length = Double.valueOf(ReadUtils.readValueFromConsole());
        System.out.println("Enter width");
        double width = Double.valueOf(ReadUtils.readValueFromConsole());
        double area = width * length;
        double perimeter = 2 * area;
        double diagonal = Math.sqrt(Math.pow(width, 2) + Math.pow(length, 2));
        if (length > 0 && width > 0 && length > width) {}
        //For a rectangle with length = 9 and widht = 5, calculate and print area, perimeter and diagonal;
        if (length == 9 && width == 5) {
            System.out.println(area);
            System.out.println(perimeter);
            System.out.println(diagonal);
        } else {
            System.out.println("Please introduce positive values and length value > width value");
        }

    }
}
