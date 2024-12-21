package com.arrays;


public class MoveZerosToEnd {


    static void moveZeros(int[] arr) {
        int nonZeroIndex = 0;


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[nonZeroIndex++] = arr[i];
            }
        }

        while (nonZeroIndex < arr.length) {
            arr[nonZeroIndex++] = 0;
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 5,6,0,12};


        moveZeros(arr);


        System.out.println("Array after moving zeros to the end:");
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }


}



//Time Complexity = O(n)
//Space Complexity = O(1)

