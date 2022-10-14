package LinearSearch;

import java.util.Arrays;

public class Searchin2Darrays {
    public static void main(String[] args) {
        int[][] arr= new int[][]{
                {1,2,3,4},
                {5,6},
                {7,8,9}
        };
        int target=81;
        int[] ans=searchin2Darrays(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] searchin2Darrays(int[][] arr,int target)
    {
        for(int row=0;row<arr.length;row++)
        {
            for(int column=0;column<arr[row].length;column++)
            {
                if(arr[row][column]==target)
                {
                    return new int[]{row, column};
                }
            }

        }
        return new int[]{-1,-1};
    }
}
