/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class BubbleSort {

    public static void bubbleSort(int a[], int size) {
        int outer, inner, temp;
        for (outer = size - 1; outer > 0; outer--) { // counting down
            for (inner = 0; inner < outer; inner++) { // bubbling up
                if (a[inner] > a[inner + 1]) {
                    temp = a[inner];
                    a[inner] = a[inner + 1];
                    a[inner + 1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {34,53,13,56,43,76};
        int size = arr.length;

         bubbleSort(arr, size);

         for (int i = 0; i < arr.length; i++){
             System.out.print(arr[i] + " ");
         }
    }
}
// Bubble Sort algorithms time complexity are O(n^2)
// This is because it has two nested loops, one for iterating over each element
// And the other one for iterating over the unsorted parts of the array