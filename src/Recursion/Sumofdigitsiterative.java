package Recursion;

public class Sumofdigitsiterative {
    public static void main(String[] args) {
        int a=456;
        System.out.println(sumofdigits(a));
    }
    static int sumofdigits(int a)
    {   int sum=0;
        while(a>0)
        {
            sum=sum+a%10;
            a=a/10;
        }
        return sum;
    }
}
