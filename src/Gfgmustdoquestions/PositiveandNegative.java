package Gfgmustdoquestions;

import java.util.ArrayList;
import java.util.Arrays;

public class PositiveandNegative {
    public static void main(String[] args) {
        int n=7;
        int[] arr={-5,-7,1,2,8,2,-10};
        int [] temp=new int[n];
        int i=0;
        for(int index = 0; index<arr.length; index++)
        {
            if(arr[index]>0)
            {
                temp[i]=arr[index];
                i++;
            }
        }
        for(int index = 0; index<arr.length; index++)
        {
            if(arr[index]<0)
            {
                temp[i]=arr[index];
                i++;
            }
        }

        System.out.println(Arrays.toString(temp));

    }
}
