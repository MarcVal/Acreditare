package Lab3Algorithms;

import ReadUtils.ReadUtils;

/**
 * Created by Valeria Marc on 11/30/2016.
 */
public class daysOfFebruary {

    public static void main(String[] args) {
        System.out.println("Enter a year:");
        int y = Integer.valueOf(ReadUtils.readValueFromConsole());
        int b = 4;
        int min = 1900;
        int max = 2017;

        String normalYear = ("1st of February " + y + ";" + "2nd of February " + y + ";" + "3rd of Februrary" + y + ";" + "+..." + "28th of February" + y);
        String bisectYear = ("; " + "29th of February" + y + ".");

        if (y < 2017 && y > 1900) {
           {
                if (y % b == 0 && y % 100 != 0) {
                    System.out.println(normalYear + bisectYear);
                } else {
                    System.out.println(normalYear);
                }
            }
        }
        else {
            System.out.println("Please enter a year between 1900 and 2016 only:");
        }
   }
}

/* 	public static void main (String... args) {
		int a = Integer.parseInt(args[0]);
		if (a<=1900 || a>=2016){
			System.out.println("Baga anii intre 1900 si 2016");
		}
			else if (a%4==0 && a%100!=0){

				System.out.println("29 de zile");

			}
			else if (a%100==0 && a%400!=0){
				System.out.println("29 de zile");
				}
			else {
			System.out.println("28 de zile");
			}
	} */
