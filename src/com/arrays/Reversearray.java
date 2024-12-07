package com.arrays;

public class Reversearray {

    static void reverseArray(int arr[]) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int arr[] = {10, 37, 23, 54, 24};


        reverseArray(arr);

        System.out.println("Reversed Array:");
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}

//Time Complexity = O(n) / n/2
//Space Complexity = O(1)
