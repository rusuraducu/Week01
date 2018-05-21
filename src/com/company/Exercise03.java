/*/*
*Write a program that calculates the number of milliseconds contained in X hours, Y minutes and Z seconds, where X, Y
*and Z are inputs introduced by the user. (check that Y < 60, Z < 60, and both >= 0)
 */
package com.company;
import java.util.Scanner;

public class Exercise03 {
       public static void main(String [] args)
       {
           Scanner reader = new Scanner(System.in);
           Scanner scan = new Scanner(System.in);

           System.out.println("Hours: ");
           int hoursX = scan.nextInt();

           System.out.println("Minutes: ");
           int minutesY = scan.nextInt();

           System.out.println("Seconds: ");
           int secondsZ = scan.nextInt();

           boolean hoursAndMinutesSmallerThan60GreaterThan0 = (secondsZ < 60) && (secondsZ > 0 ) && (minutesY < 60) && (minutesY > 0 );

           long totalSeconds = hoursX*3600 + minutesY*60 + secondsZ;
           long milliseconds =totalSeconds*1000;

           System.out.println(hoursAndMinutesSmallerThan60GreaterThan0 ? "Total milliseconds: " +milliseconds : "Error: (The entered values are invalid.) ");

       }
}
//36000488000