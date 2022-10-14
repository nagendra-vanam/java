package Recursion;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={2,5,3,8,9,10};
        int target=7768;
        System.out.println(Search(arr,0,target));

    }
    static Boolean Search(int[] arr,int index,int target)
    {
        if(index==arr.length)
        {
            return false;
        }
       return arr[index]==target || Search(arr,index+1,target);

    }
}
