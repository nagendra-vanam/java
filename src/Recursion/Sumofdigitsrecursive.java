package Recursion;

public class Sumofdigitsrecursive {
    public static void main(String[] args) {
        int n=123;
        System.out.println(digits(n));
    }
    static int digits(int n)
    {
        if(n<=0)
        {
            return 0;
        }
        return n%10 +digits(n/10);
    }
}
