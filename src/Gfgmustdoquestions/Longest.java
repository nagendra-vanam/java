package Gfgmustdoquestions;

import java.util.HashMap;

public class Longest {
    public static void main(String[] args) {
        int[] arr={2,6,1,9,4,5,3};
        System.out.println(longestsub(arr));
    }
    static int longestsub(int[] arr)
    {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            map.put(arr[i],1);
        }
        int max=0;int count=1;
        boolean positive=false;
        boolean negative=false;
        for(int j=0;j<arr.length;j++)
        {
            if(map.containsKey(arr[j]+1))
            {
                count++;
                positive= true;
            }
            if(map.containsKey(arr[j]-1))
            {
                count++;
                negative=true;
            }


        }
        return 1;
    }
}
