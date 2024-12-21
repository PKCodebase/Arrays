package com.arrays;

public class ArrayIsAscending {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 8, 7, 8, 9, 10};
        boolean result = isAscending(arr);
        System.out.println(result);
    }
    private static boolean isAscending(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
