package com.arrays;


import java.util.Arrays;

public class RemoveDuplicate {



        static int removeDuplicatesSorted(int[] arr) {
            if (arr.length == 0) {
                return 0;
            }

            int uniqueIndex = 0;

            for (int i = 1; i < arr.length; i++) {
                if (arr[i] != arr[uniqueIndex]) {
                    uniqueIndex++;
                    arr[uniqueIndex] = arr[i];
                }
            }

            return uniqueIndex + 1;
        }

        public static void main(String[] args) {
            int arr[] = {10, 37, 23, 54, 24, 10, 37,10};


            Arrays.sort(arr);


            int newLength = removeDuplicatesSorted(arr);


            System.out.println("Array after removing duplicates:");
            for (int i = 0; i < newLength; i++) {
                System.out.print(arr[i] + " ");
            }
        }

}

//Time Complexity = O(n log n)
//Space Complexity = O(1)

