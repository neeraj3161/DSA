package com.company;

import javax.sound.sampled.Line;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        LinearSearch linearSearch= new LinearSearch();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no of elements in an array: ");
        int no_of_elements = 0;
        try{
             no_of_elements= scanner.nextInt();
        int[] mainArray=new int[no_of_elements];

        for (int i=0;i<no_of_elements;i++){
            System.out.println("Enter element "+(i+1)+"# ");
                int arrayInput= scanner.nextInt();
                mainArray[i]=arrayInput;
        }
//            System.out.println(mainArray.length);
            System.out.println("Enter the search element: ");
            int searchElement= scanner.nextInt();
            System.out.println("The search element lies at position "+linearSearch.linearSearch(mainArray,searchElement));

        }catch (InputMismatchException e){
            System.out.println("Enter a integer!!");
        }
}
}