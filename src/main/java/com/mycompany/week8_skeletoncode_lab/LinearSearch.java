/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class LinearSearch {
    
    public static int search(int arr[], int x)
    {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int target = 4;

        int index = search(arr, target);
        System.out.print(index);
    }
    
}
// Linear searches have a time complexity of O(n)
// n represents the size of the array
// as the array size gets larger the amount of numbers the algorithm checks increases linearly

// The space complexity of the algorithm is O(1)
// The reason is the the variables are a constant size
