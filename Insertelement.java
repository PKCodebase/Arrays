package com.programs;

import java.util.Scanner;



public class Insertelement {

     static int insertElement(int[] arr, int element, int position) {
         int size = arr.length;
         int index = position-1;
         for(int i = size-1;i>index;i--){
             arr[i] = arr[i-1];

         }arr[index] = element;
         return size+1;
    }
    public static void main(String[] args) {
        int arr[] = new int[5];
        arr[0] = 10;
        arr[1] = 76;
        arr[2] = 56;
        arr[3] = 53;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the element: ");
        int element = sc.nextInt();
        System.out.print("Enter the position: ");
        int position = sc.nextInt();

        for (int i = 0;i< arr.length;i++){
            System.out.println(arr[i]+" ");
        }

        System.out.println("After insert element:");
         insertElement(arr,element,position);

        for (int i = 0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }


    }



}
