/**
 *  Java program to use java.lang.Math methods abs(), pow(), sqrt(), and random().
 */

package com.mynumbers;

import java.util.Random;

/**
 * Main class.
 */
public class Main {

    // Main method to run java program.
    public static void main(String[] args) {

        // Method abs(int number) returns absolute value of integer.
        System.out.println("Absolute value of -6 is " + Math.abs(-6)); // Output: 6
        System.out.println("Absolute value of 6 is " + Math.abs(6)); // Output: 6

        // Method abs(double number) returns absolute value of double number.
        System.out.println("Absolute value of -6.9 is " +Math.abs( -6.9)); // Output: 6.9
        System.out.println("Absolute value of 6.9 is " +Math.abs(6.9)); // Output: 6.9

        // Method abs(int number) returns absolute value of long number.
        System.out.println("Absolute value of -593 is " + Math.abs(-593)); // Output: 593
        System.out.println("Absolute value of 593 is " + Math.abs(593)); // Output: 593

        // Method abs(int number) returns absolute value of long number.
        System.out.println("Absolute value of -428.9F is " + Math.abs(-428.9F)); // Output: 428.9
        System.out.println("Absolute value of 428.9F is " + Math.abs(428.9F)); // Output: 428.9

        // Method pow(double base, double exponent) returns the first parameter raised to power of the second parameter.
        double number = Math.pow(12, 3);
        System.out.println("Power of 12 by 3 is " + number); // Output: 1728.0

        double number1 = Math.pow(2, 8);
        System.out.println("Power of 2 by 8 is " + number1); // Output: 256.0

        // Method sqrt(double number) returns square root of a double value.
        double x = Math.sqrt(64);
        System.out.println("Square root of 64 is " + x); // Output: 8.0

        double y = Math.sqrt(81);
        System.out.println("Square root of 81 is " + y); // Output: 9.0

        double z = Math.sqrt(47);
        System.out.println("Square root of 47 is " + z); // Output: 6.855654600401044

        // Double random() returns any double value between 0.0 and 1.0.
        System.out.println("Random value from [0.0, 1.0) " + Math.random());
        System.out.println("Random value from [0.0, 1.0) " + Math.random());
        System.out.println("Random value from [0.0, 1.0) " + Math.random());
        System.out.println("Random value from [0.0, 1.0) " + Math.random());
        System.out.println("Random value from [0.0, 1.0) " + Math.random());
        System.out.println("Random value from [0.0, 1.0) " + Math.random());

        // Double random() returns any double value between 0.0 and 10.
        System.out.println("Random double value from [0.0, 10) " + Math.random() * 10);

        // Double random() returns any double value between 0.0 and 9 included.
        System.out.println("Random double value from [0.0, 9] " + Math.random() * 10);

        // Integer random() returns any integer value between 0.0 and 9 included.
        System.out.println("Random integer value from [0, 9] " + (int) (Math.random() * 10));

        // Integer random() returns any integer value between 0 and 9 included.
        System.out.println("Random integer value from [1, 9] " + (1 + (int) (Math.random() * 10)));

        // Integer random() returns any integer value between 0 and 100.
        System.out.println("Random integer value from [0, 99] " + (int) (Math.random() * 100));

        // Integer random() returns any integer value in range of 10 up to 30.
        int minNumber = 10;
        int maxNumber = 30;
        System.out.println("Random integer value from [10, 30] " + ((int) (Math.random() * (1 +
                maxNumber - minNumber)) + minNumber));

        // Random integer number.
        System.out.println("Random number: " + new Random().nextInt());

        // Random integer number with bound 99.
        System.out.println("Random number: " + new Random().nextInt(99));

    }
}