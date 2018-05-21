/*
*Given three values representing the angles in a triangle,
*print if the triangle is right-angled or not (check if
*the triangle is a valid one)
 */

package com.company;
public class Exercise01 {

    public static void main(String[] args) {
        double angleA = 20;
        double angleB = 70;
        double angleC = 90;
        double sumOfTheAngles = angleA + angleB + angleC;
        boolean checkIfABCisTriangle =  sumOfTheAngles == 180;
        boolean rightAngled = (angleA == 90 || angleB == 90 || angleC == 90);

        System.out.println(checkIfABCisTriangle && rightAngled ? "ABC is a triangle with a right-angled." : "ABC is not a triangle or a right-angled triangle.");
    }

}
