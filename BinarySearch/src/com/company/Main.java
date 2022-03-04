package com.company;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the size of array elements: ");
            int no_of_elements= scanner.nextInt();
            int [] arrayElements= new int[no_of_elements];
            int err=1;
            for(int i=0;i<no_of_elements;i++){
                if(err>0){
                    System.out.println("Enter element "+(i+1)+": ");
                    int inputElement = scanner.nextInt();
                    if(i>0){
                        for(int j=0;j<=i;j++){
                            if(arrayElements[j]>inputElement){
                                System.out.println("Current element \""+inputElement+"\" should be greater than the previously entered element!!");
                                err=-1;
                                break;
                            }else{
                                arrayElements[i]=inputElement;
                            }
                        }
                    }else{
                        arrayElements[i]=inputElement;
                    }
                }else{
                    break;
                }

        }
            if(err>0){
                System.out.println(Arrays.toString(arrayElements));
                System.out.println("Enter the array Element you would like to search: ");
                int searchInput=scanner.nextInt();
                BinarySearch binarSearch=new BinarySearch();
                System.out.println("Index of search arrays lies at position "+ binarSearch.binarySearch(arrayElements,searchInput,no_of_elements));
            }
        }catch(InputMismatchException e){
            System.out.println("Please enter a integer!!");

    }

}
}