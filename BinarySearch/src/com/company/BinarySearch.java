package com.company;

public class BinarySearch {
    public int binarySearch(int[] arr, int searchElement,int size){
        int low,mid,high;
        low=0;
        high=arr.length-1;
//        low<=high will check it till the last element
        while(low<=high){
            mid=(low+high)/2;
            if(arr[mid]==searchElement){
                return mid;
            }
//            Assuming this is a sorted array in ascending order
            if(arr[mid]<searchElement){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return -1;
    }
}