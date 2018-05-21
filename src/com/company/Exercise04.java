/*
*Print the area and circumference of a circle from the radius (learn which types of variables to choose?
 */

package com.company;
public class Exercise04 {
    public static void main(String[] args) {

        double pi = 3.14;
        double radius = 10;
        double area = pi * (radius * radius);
        double circumference = 2 * pi * radius;
        System.out.printf("The area of the circle with the radius %.0f is %.2f.", radius, area);
        System.out.printf("\nThe circumferince is %.2f.", circumference);
    }
}
