public class linearSearchInRange {
    //will have a start and end index
    //if we have a array [1,2,3,4,5,6,7] if the range is from 2,4 then it will only iterate from index 2 till 4 and will try to find the element

    public static void main(String[] args) {
        System.out.println(linearSearch(new int[]{1,2,3,4,5,6},6,0,4));
    }

    static int linearSearch(int[] arr,int target,int startIndex,int endIndex){
        if(arr.length==0){
            return -1;
        }
        for(int i=startIndex;i<=endIndex;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
