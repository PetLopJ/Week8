/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class Problem01 {
    
    public static long getSumOfPrimes(int n){
        long sum = 0;
        for(int num = 2; num <= n; num++) {
            if (primeFunc(num)) {
                sum += num;
            }
        }
        return sum;
    }
    public static boolean primeFunc(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int n = 5;
        long sum = getSumOfPrimes(n);
        System.out.print(sum);
    }
}

// The method traverses from 2 to n. The loop runs n-1 times
// As it loops, the primeFunc method iterates all the way to the
// square root of the number.
// The time complexity of the method overall is O(n * sqrt n)
// f(n) = primeFunc = O(sqrt n)
// f(n) = getSumOfPrimes = O(n)

// The space complexity is O(1) because the method initializes a few variables
// Therefore only yielding a complexity of O(1)
