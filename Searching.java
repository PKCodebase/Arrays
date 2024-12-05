package com.programs;

import java.util.Scanner;

public class Searching {
     static int linearSearch(int[] arr, int element) {
         int size = arr.length;
         for(int i=0;i<size;i++){
             if(arr[i] == element){
                 return i;
             }

         }
         return -1;

    }

    public static void main(String[] args) {
      int arr[] = {10,30,25,40,35,23};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the element:");
        int element = sc.nextInt();

        int index = linearSearch(arr,element);
        System.out.print(index+".");
        if(index == -1){
            System.out.println(" Element not found ");
        }else{
            System.out.println(" Element found at Index:" +index);
        }
    }


}


