package Recursion;

import java.util.ArrayList;

public class imp {
    public static void main(String[] args) {
        int[] arr={1,2,3,3,4,5};
//        ArrayList<Integer> list=new ArrayList<>();
        int target=3;
        ArrayList<Integer> ans= formation(arr,target,0);
        System.out.println(ans);
    }
    static ArrayList<Integer> formation(int[] arr,int target,int index)
    {
        ArrayList<Integer> list=new ArrayList<>();
        if(index==arr.length)
        {
            return list;
        }
        if(arr[index]==target)
        {
            list.add(index);
        }
        ArrayList<Integer> belowcalls=formation(arr,target,index+1);
        list.addAll(belowcalls);
        return list;
    }
}
