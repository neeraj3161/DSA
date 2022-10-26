public class findMaximum {
    public static void main(String[] args) {
        System.out.println(findMax(new int[]{5,55,66,88,99,1}));
    }

    static int findMax(int[] arr ){
        if(arr.length==0){
            return -1;
        }

        int max = arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
