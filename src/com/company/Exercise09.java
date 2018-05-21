/*
 *Write a program that accepts 2 integers values as input between 13 and 89 and prints true if there is a common digit in
 *both numbers. Example: x=34, y=48, the output should be true.
 */

package com.company;

import java.util.Scanner;

public class Exercise09 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);

        //Enter the numbers

        System.out.println("Enter the value of variable a: ");
        int a = scan.nextInt();
        if (a < 13 || a > 89) {
            while (a < 13 || a > 89) {
                System.out.println("You have to enter a value between 13 and 89: ");
                a = scan.nextInt();
            }
        }
        System.out.println("Enter the value of variable b: ");
        int b = scan.nextInt();
        if (b < 13 || b > 89) {
            while (b < 13 || b > 89) {
                System.out.println("You have to enter a value between 13 and 89:");
                b = scan.nextInt();
            }
        }

        int firstDigitA = (a / 10) % 10;
        int secondDigitA = a % 10;
        int firstDigitB = (b / 10) % 10;
        int secondDigitB = b % 10;

        boolean commonDigit = (firstDigitA == firstDigitB || secondDigitA == secondDigitB ||
                firstDigitB == firstDigitA || secondDigitB == secondDigitA || firstDigitA == secondDigitB ||
                secondDigitA == secondDigitB || firstDigitB == secondDigitA ||
                secondDigitB == firstDigitA);

        String isCommonDigit = commonDigit ? "There is a common digit." : "There is not a common digit.";
        System.out.println(isCommonDigit);
    }
}
