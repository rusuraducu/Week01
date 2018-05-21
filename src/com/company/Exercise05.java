/*
Write a program that converts the height of a person from feet and inches (e.g 5 feet 10 inches) to centimeters (178cm).
The value should be integer. To convert a double value to an integer, you can use the cast operator: double d = 33.4; int
i = (int)d; // i will be 33;

 */

package com.company;
public class Exercise05 {
    public static void main (String[] args) {

        double foottocm = 30.48;
        double inchestocm = 2.54;

        int heightOfaPersonFeet = 5;
        int heightOfaPersonInches = 10;

        double heightInCm = heightOfaPersonFeet*foottocm + inchestocm*heightOfaPersonInches;

        //Print the conversion in centimeters.

        System.out.printf("The person is %.0f centimeters tall.", heightInCm);

    }
}
