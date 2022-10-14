package Arrays;

import java.util.Arrays;

public class Subarraywithgivensum {
    public static void main(String[] args) {
        int[] arr={1,2,3,7,5};
        int target=12;
        System.out.println(Arrays.toString(givensum(arr,target)));
    }
    static int[] givensum(int[] arr,int target)
    {
        int[] ans={-1};
        int sum=0;
        int i=0;int j=0;
        while(i<arr.length&&j<arr.length)
        {
            sum=sum+arr[i];
            if(sum>target)
            {
                ++j;
                sum=sum-arr[j];
            }
            else{
                i++;
            }
            if(sum==target)
            {
                return new int[]{i,j};
            }
        }
        return ans;
    }
}
