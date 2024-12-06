package org.test;

public class Prime {

    public static void main(String[] args) {
        int num = 13; // Example input
        boolean isPrime = true;

        if (num > 1) {
            if (num == 2) {
                isPrime = true; // Special case: 2 is prime
            } else {
                int i = 2;
                while (i < num) {
                    if (num % i == 0) { // If divisible, it's not prime
                        isPrime = false;
                        break;
                    }
                    i++;
                }
            }
        } else {
            isPrime = false; // Numbers <= 1 are not prime
        }

        if (isPrime) {
            System.out.println(num + " is a Prime Number");
        } else {
            System.out.println(num + " is Not a Prime Number");
        }
    }
}