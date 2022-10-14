package Recursion;

public class ReverseNUmber {
    public static void main(String[] args) {
        System.out.println(revese(1234));
    }
    static int k=0;

    static int revese(int a)
    {

        if(a%10==0)
        {
            return k;
        }
         k= k*10+(a % 10);
        return revese(a/10);
    }
}
