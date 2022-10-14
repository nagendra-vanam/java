package Gfgmustdoquestions;

import java.util.Arrays;

public class Wavyarray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        System.out.println(Arrays.toString(Wavy(arr)));
    }
    static int[] Wavy(int[] arr)
    {
        for(int index=0;index<arr.length/2;index++)
        {
            int i=index*2;
            int j=index*2 +1;
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        return arr;
    }
}
