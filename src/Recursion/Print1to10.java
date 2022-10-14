package Recursion;

public class Print1to10 {
    public static void main(String[] args) {
        int a=10;
        numbers(a);
    }
    static void numbers(int a)
    {
        if(a==0)
        {
            System.out.println(0);
            return;
        }
        System.out.println(a);
         numbers(a-1);
    }
}
