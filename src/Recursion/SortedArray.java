package Recursion;

import java.sql.SQLOutput;

public class SortedArray {
    public static void main(String[] args) {
    int[] arr={1,3,5,8,7};
        System.out.println(Sorted(arr,0));
    }
//    static int i=0;
    static Boolean Sorted(int[] arr,int i)

    {
        if(i==arr.length-1)
        {
            return true;
        }
         return arr[i]<arr[i+1] && Sorted(arr,i+1);
    }
}
