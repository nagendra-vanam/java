package Gfgmustdoquestions;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr={-25,38,24,-17,7,31,43,8,20 ,49 ,-33, -11, 19 ,13, -28, 44, 23 ,3, -19 ,12 ,32 ,40, 42 ,41, 7 ,-35 ,-29 ,7 ,24, 41 ,-3, 1 ,-19, -29, -13, -10 ,4 ,-20 ,48};
        System.out.println(missing(arr));
    }
    static int missing(int[] arr)
    {
        for(int index=0;index<arr.length;index++)
       {
           if(arr[index]<=arr.length&&arr[index]>0)
           {
               if(arr[index]==index+1) {
                        continue;
           }
               else{

                  int temp=arr[arr[index]-1];//-25
                   if(temp<=0)
                   {
                       arr[arr[index]-1]=arr[index];
                   }
                   else {
                       arr[arr[index] - 1] = arr[index];  //arr[0]=1
                       arr[index] = temp;
                   }

               }
           }
       }
        System.out.println(Arrays.toString(arr));
        for(int j=0;j<arr.length;j++)
        {
            if(arr[j]!=j+1)
            {
                return j+1;
            }
        }
        return arr.length+1;
    }
}
