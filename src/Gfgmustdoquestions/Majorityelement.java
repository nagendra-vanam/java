package Gfgmustdoquestions;

import java.util.HashMap;
import java.util.Map;

public class Majorityelement {
    public static void main(String[] args) {
        int[] arr={3,1,2,4,5};
        System.out.println(Majority(arr));
    }
    static int Majority(int[] arr)
    {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            if(map.containsKey(arr[i]))
            {
                int prev=map.get(arr[i]);
                map.put(arr[i],1+prev);
            }
            else{
                map.put(arr[i],1);
            }
        }
        for(Map.Entry<Integer,Integer>e:map.entrySet())
        {
           if(e.getValue()>arr.length/2){
               return e.getKey();
           }
        }
        return -1;
    }

}
