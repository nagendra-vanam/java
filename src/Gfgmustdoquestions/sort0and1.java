package Gfgmustdoquestions;

import java.util.Arrays;

public class sort0and1 {
    public static void main(String[] args) {
        int[] arr={1,0,1,1,0,0,0};
        System.out.println(Arrays.toString(sort(arr)));
    }
    static int[] sort(int[] arr)
    {
        int i=0;
        int j=arr.length-1;
        while(i<=j)
        {
            if(arr[j]!=0)
            {
                j--;
            }
            else{
                if(arr[i]!=1)
                {
                    i++;
                }
                else{
                    arr[j]=1;
                    arr[i]=0;
                    i++;
                    j--;
                }
            }

        }
        return arr;
    }
}
