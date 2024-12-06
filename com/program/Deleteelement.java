package com.programs.com.program;

public class Deleteelement {
    public static void main(String[] args) {
        int arr[] = {10, 20, 67, 54, 29};
        int element = 30;

        System.out.println("Original Array:");
        printArray(arr);

        deleteElement(arr, element);
    }

    public static void deleteElement(int[] arr, int element) {
        int position = -1;

        // Find the element position
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == element) {
                position = i;
                break;
            }
        }

        if(position != -1) {
            for(int i = position; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[arr.length - 1] = 0; 

            System.out.println("\nArray after deleting element " + element + ":");
            printArray(arr);
        } else {
            System.out.println("\nElement " + element + " not found in array");
        }
    }

    public static void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
