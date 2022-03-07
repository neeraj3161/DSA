package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[]{5, 6, 7, 2, 4, 1, 7};
        mergeSort mergeSort=new mergeSort();
        mergeSort.mergeSort(array, 0, array.length-1);
        System.out.println("Sorted arrays: ");
        System.out.println(Arrays.toString(array));
    }
}