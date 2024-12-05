package com.programs;

import java.util.ArrayList;
import java.util.Scanner;

public class InsertelementList {

    static void insertElement(ArrayList<Integer> list, int element, int position) {
        int index = position - 1;
        list.add(index, element);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(76);
        list.add(56);
        list.add(53);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the element: ");
        int element = sc.nextInt();
        System.out.print("Enter the position: ");
        int position = sc.nextInt();


        for (int num : list) {
            System.out.print(num + " ");
        }
        
        System.out.println("After insertion:");

        insertElement(list, element, position);


        for (int num : list) {
            System.out.print(num + " ");
        }
    }
}