package Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class MutiplelinearSerach {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 4, 6, 7};
        Multi(arr, 0, 9);
        if(list.size()==0)
        {
            System.out.println(Arrays.toString(new int[] {-1,-1}));
        }
        else{
            System.out.println(list);
        }
    }
    static ArrayList<Integer>list=new ArrayList<>();
    static void Multi(int[] arr,int index,int target)
    {
        if(arr.length==index)
        {
            return;
        }
        if(arr[index]==target)
        {
           list.add(index);
        }
        Multi(arr,index+1,target);
    }
}
