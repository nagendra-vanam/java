package Gfgmustdoquestions;

import java.util.Arrays;

public class Triplet {
    public static void main(String[] args) {
        int[] arr={1,2,4,5,16};
        int target=11;
        System.out.println(triple(arr,target));
    }
    static boolean triple(int[] arr,int target)
    {
        Arrays.sort(arr);
        int s=arr.length-1;
        for(int k=0;k<arr.length;k++) {
            int sum=target-arr[k];
            int l=0;
          while(l<s) {
              if (l == k) {
                  l++;
              } else if (k == s) {
                  s--;
              } else {
                  if (arr[l] + arr[s] == sum) {
                      return true;
                  } else if (arr[l] + arr[s] > sum) {
                      s--;
                  } else {
                      l++;
                  }

              }
          }
      }
        return false;
    }
}
