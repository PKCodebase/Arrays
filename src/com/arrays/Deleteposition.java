package com.arrays;

import java.util.Arrays;

public class Deleteposition {
    public static void removeElement(int[] arr, int position) {
        int size = position-1;
        for(int i = size;i<arr.length-1;i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = 0;

    }
    public static void main(String[] args) {
        int[] arr = {10, 22, 13, 54, 35};
        int position = 3;
        removeElement(arr, position);
        System.out.println("Array after removal: " + Arrays.toString(arr));

    }

}
