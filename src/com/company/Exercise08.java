/*
*Write a program that accepts three integers from the user and return true if the second number is greater than the first
*number and third number is greater than second number. Consider also a condition which if it is true, the second number
*does not need to be greater than first number.
 */
package com.company;
import java.util.Scanner;

public class Exercise08 {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the value of variable a: ");
        int a = scan.nextInt();

        //Condition

        boolean conditionBsmallerThanA = a % 2 == 0; //If a is even, b must be smaller a.

        System.out.println(conditionBsmallerThanA? "Enter the value of variable b. It must be smaller then  "+a+"."
                : "Enter the value of b.");

        int b = scan.nextInt();
        if (conditionBsmallerThanA)
        {
            while(b>=a)
            {
                System.out.printf("The value of b is greater or equal with %d. Enter another value. It must be smaller than the previous value.", a);
                b = scan.nextInt();
            }
        }

        System.out.println("Enter the value of variable c: ");
        int c = scan.nextInt();

        boolean bGreaterThanAandCisGreaterThanB = b > a && c > b;
        System.out.println(bGreaterThanAandCisGreaterThanB);
    }
}
