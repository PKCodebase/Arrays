package com.arrays;

public class DescendingArray {
    public static void main(String[] args) {
        int arr [] = {89,45,96,34,65,26,84};
        int temp;
        for(int i = 0;i< arr.length-1;i++){
            for(int j = 0;j<arr.length-i-1;j++){
                if(arr[j]<arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.print("Descending Array : ");
        for(int num : arr){
            System.out.print(num+" ");
        }
    }
}

//Time Complexity: Best Case:O(n)/Wrost Case:O(n2)
//Space Complexity : O(1)