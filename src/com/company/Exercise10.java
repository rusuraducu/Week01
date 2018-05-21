/*
*Write a program to find the number of integers within the range of two numbers received as input and that are divisible
*by another number (also received as input). Example: x=5, y=20 and p=3, the output should be 5. For x=6, y=22 and p=2,
*the output should be 9.
***
*
Pseudocode:

 1. read a variable called "integerOne" and another one called "integerTwo".
 2. read a variable called "divisor".
 3. define an integer variable called "counter = 0" // Because it starts counting from the value 0.
 4. define a variable called "remainder" => it  holds the remainder of the dividing.
 5. divide by divisor each number from the interval.
 6. if the remainder is 0 then increase the variable  "counter" with an unit.
 7. print the result.
 */
package com.company;

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the value of the number one:");
        int integerOne = scan.nextInt();

        System.out.println("Enter the value of the number two:");
        int integerTwo = scan.nextInt();

        System.out.println("Enter the value of the divisor:");
        int divisor = scan.nextInt();

        int counter = 0;

        for (int i = integerOne; i <= integerTwo; i++) {
            int remainder = i % divisor;
            if (remainder == 0) {
                counter++;
            }
        }
        System.out.printf("There are %d integers between the interval %d to %d which are divisible by %d.", counter, integerOne, integerTwo, divisor);

    }

}
