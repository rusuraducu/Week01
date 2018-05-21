/*
Write a program to accept a positive number, not bigger than 1000 and check that the number is even or not. Prints 1
if the number is even or 0 if the number is odd. (check if they did the check)
 */
package com.company;
import java.util.Scanner;
public class Exercise07 {
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number from 1 to 1000: ");
        int number = scan.nextInt();

        boolean conditions = number  > 0 && number<= 1000;
        boolean isEven = number% 2 == 0;
        String message = isEven ? "1":"0";

        System.out.println(conditions ? message :"You have entered the number " +number+ ". This number is not between the interval 1 - 1000.");
    }
}
