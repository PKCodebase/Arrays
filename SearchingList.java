package com.programs;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SearchingList {
    static int linearSearch(List<Integer> list, int element) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i) == element) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 30, 25, 40, 35, 23);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the element: ");
        int element = sc.nextInt();

        int index = linearSearch(list, element);
        if (index == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found at Index: " + index);
        }
    }
}