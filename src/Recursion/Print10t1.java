package Recursion;

public class Print10t1 {
    public static void main(String[] args) {
        int a=10;
        number(a);
    }
    static void number(int a)
    {
        if(a==0)
        {
            System.out.println(0);
            return;
        }

        number(a-1);
        System.out.println(a);
    }
}
