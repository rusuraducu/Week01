/*Write a program that converts the height of a person from centimeters to feet and inches.
The printed values should be two integers.   //1foot=30.48 cm  1foot = 12 inches; 1 inch = 2,54 cm
 */

package com.company;
public class Exercise06 {

    public static void main(String[] args)
    {
        int heightInCentimeters = 178;

        double heightInFeet =heightInCentimeters/30.48;
        int heightInFeetInt = (int)heightInFeet;

        double remainderConversion = heightInCentimeters%30.48;
        double heightInInches = remainderConversion/2.54;

        System.out.printf("The pearson is %d feet and %.0f inches tall.",heightInFeetInt,heightInInches);
    }
}
