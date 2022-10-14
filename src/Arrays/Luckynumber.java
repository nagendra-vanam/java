package Arrays;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Luckynumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
             arr[i]= sc.nextInt();
        }
        int count=1;
        boolean flag=false;
        for(int j=0;j<n-1;j++)
        {
            if(arr[j]==arr[j+1])
            {
                count++;

            }
            else{
                if(count==arr[j])
                {
                    flag=true;
                    System.out.println(count);

                }
                count=1;
            }

        }
        if(arr[arr.length-1]==count){
            flag=true;
            System.out.println(count);
        }
        if(flag==false)
        {
            System.out.println(-1);
        }
    }
}
