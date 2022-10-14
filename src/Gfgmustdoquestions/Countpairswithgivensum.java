package Gfgmustdoquestions;

import java.util.HashMap;
import java.util.Map;

//Input:
//        N = 4, K = 6
//        arr[] = {1, 5, 7, 1}
//        Output: 2
//        Explanation:
//        arr[0] + arr[1] = 1 + 5 = 6
//        and arr[1] + arr[3] = 5 + 1 = 6.
public class Countpairswithgivensum {
    public static void main(String[] args) {
        int[] arr={1,5,7,1};
        int k=6;
        System.out.println(pairs(arr,k));
    }
    static int pairs(int[] arr,int k)
    {
        int count=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int index=0;index<arr.length;index++)
        {

            if(map.containsKey(arr[index]))
            {
                map.put(arr[index],1+map.get(arr[index]));
            }
            else{
                map.put(arr[index],1);
        }

        }
//        for(Map.Entry<Integer,Integer> e:map.entrySet())
//        {
//            int val=k-e.getValue();
//            if(map.containsKey(val))
//            {
//                int z=map.get(val);
//                if(val==e.getKey())
//                {
//
//                }
//            }
//        }
        System.out.println(map);
        return count;
    }
}
