public class findMinimum {
    //find the minimum element the array

    public static void main(String[] args) {
        int[] arr = {};
        System.out.println("Minimum number in the array using linear search is "+findMinimumNumber(arr));
    }

    static int findMinimumNumber(int[] arr){
        if(arr.length==0){
            return -1;
        }
        int min=arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
}
