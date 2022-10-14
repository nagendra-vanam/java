package LinearSearch;

public class MaxAndMin {
    public static void main(String[] args) {
        int[] arr={3,8,5,3,18,-9,-2};
        int max=maximum(arr);
        int min=minimum(arr);
        System.out.println(max+" "+min);
    }
    static int minimum(int[] arr)
    {
        int minval=9999999;
        for(int i=0;i<arr.length;i++)
        {
            if(minval>arr[i]){
                minval=arr[i];
            }
        }
        return minval;
    }static int maximum(int[] arr)
    {
        int maxval=-9999999;
        for(int i=0;i<arr.length;i++)
        {
            if(maxval<arr[i]){
                maxval=arr[i];
            }
        }
        return maxval;
    }

}
