package Gfgmustdoquestions;

import java.util.HashMap;

public class Firstreapting { public static void main(String[] args) {
    int arr[]={1, 5, 3, 4, 3, 5, 6};
    System.out.println(nonreapting(arr));
}
    static int nonreapting(int[] arr)
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int index=0; index<arr.length; index++)
        {
            if(map.containsKey(arr[index]))
            {
                map.put(arr[index],1+map.get(arr[index]));
            }
            else{
                map.put(arr[index],1);
            }
        }
        for(int index=0; index<arr.length; index++)
        {
            if(map.containsKey(arr[index]))
            {
                if(map.get(arr[index])!=1)
                {
                    return index+1;
                }
            }
        }
        return -1;
    }

}
