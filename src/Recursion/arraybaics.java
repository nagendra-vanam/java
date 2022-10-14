package Recursion;

import java.util.ArrayList;

public class arraybaics {
    public static void main(String[] args) {
        int[] arr={1,4,6,7,7,8,9};
        int target=6;
        int index=0;
        ArrayList<Integer> ans=arraySearch(arr,target,index,new ArrayList<>());
        System.out.println(ans);
    }
    static ArrayList<Integer> arraySearch(int[] arr,int target,int index,ArrayList<Integer> list)
    {
        if(arr.length==index)
        {
            return list;
        }
        if(arr[index]==target)
        {
            list.add(index);
        }
        return arraySearch(arr,target,index+1,list);
    }
}
