package Recursion;

public class Sum1ton { public static void main(String[] args) {
    int n=10;
    System.out.println(Sum(n));
}
    static int Sum(int n)
    {
        if(n==0)
        {
            return 0;
        }
        else {
            return n+Sum(n-1);
        }
    }

}
