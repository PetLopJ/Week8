/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class BinarySearch {

    public static int runBinarySearchIteratively(
            int[] sortedArray, int key, int low, int high) {
        int index = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if (sortedArray[mid] < key) {
                low = mid + 1;
            } else if (sortedArray[mid] > key) {
                high = mid - 1;
            } else if (sortedArray[mid] == key) {
                index = mid;
                break;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] array = {1,3,5,7,};
        int key = 7;
        int low = 0;
        int high = array.length - 1;

        int index = runBinarySearchIteratively(array, key, low, high);
        if (index != Integer.MAX_VALUE) {
            System.out.print("Key: " + key + " at index " + index);
        }
    }

}

// Binary search algorithms have a time complexity of O(log n)
// This is because a binary search divides the array down in each iteration until the key is found
// It differs from a linear search because it doesn't check each element

// The algorithms space complexity is O(1)
// The reason is because the algorithm only requires a constant amount of memory in terms of the variables