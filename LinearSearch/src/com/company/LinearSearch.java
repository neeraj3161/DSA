package com.company;

import java.util.Scanner;

public class LinearSearch {
    Scanner scanner = new Scanner (System.in);
    public int linearSearch(int[] arr ,int searchElement){
        for(int i=0;i<arr.length;i++){
            if(searchElement==arr[i]){
                return i;
            }
        }
        return -1;
    }
}