package Gfgmustdoquestions;

import java.util.HashMap;

public class Equalzeroandones {
    public static void main(String[] args) {
        int[] arr={1,0,0,1,0,1,1};
        System.out.println(zerosandones(arr));

    }
    static int zerosandones(int[] arr)
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int sum=0;
        int count=0;
        for(int index=0;index<arr.length;index++)
        {
            if(arr[index]==1)
            {
                sum=sum+1;
            }
            else{
                sum=sum-1;
            }

            if(map.containsKey(sum))
            {
                int z=map.get(sum);

                map.put(sum,1+z);
                count=count+(z);
            }
            else{
                map.put(sum,1);
            }

        }

        return count;
    }
}
