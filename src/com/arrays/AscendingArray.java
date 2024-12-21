package com.arrays;

public class AscendingArray {
    public static void main(String[] args) {
        int arr[]  = {80,20,30,26,10,24};
        int temp ;
        for(int i =0;i<arr.length-1;i++){
            for(int j = 0;j< arr.length-i-1;j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }
        System.out.print("Ascending  Array : ");
        for(int num :arr){
            System.out.print(num + " ");
        }

    }
}

//Time Complexity: Best Case:O(n)/ Wrost Case:O(n2)
//Space Complexity : O(1)