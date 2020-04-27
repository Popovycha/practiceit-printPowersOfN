package com.gmail.mybmcc22;

/**
 * Write a method called printPowersOfN that accepts a base and an exponent as arguments
 * and prints each power of the base from base0 (1) up to that maximum power, inclusive.
 */
public class Main {

    public static void main(String[] args) {
	// write your code here
        printPowerOfN(4, 3);
        printPowerOfN(5, 6);
        printPowerOfN(-2, 8);
    }
    static void printPowerOfN(int num, int power){
        for (int i = 1; i <=power; i++){
            System.out.print(((int) Math.pow(num, i)) + " ");
        }
        System.out.println();
    }
}
