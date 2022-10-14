package Arrays;

import java.util.Arrays;

public class ReverseanArray {
    public static void main(String[] args) {
        int[] arr={1,6,9,4};

        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static  void reverse(int[] arr)
    {
        int a=0;
        int b=arr.length-1;
        while(a<b)
        {
            int temp=arr[a];
            arr[a]=arr[b];
            arr[b]=temp;
            a++;
            b--;
        }
    }
}
