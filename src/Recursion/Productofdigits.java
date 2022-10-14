package Recursion;

public class Productofdigits {   public static void main(String[] args) {
    int n=1234;
    System.out.println(digits(n));
}
    static int digits(int n)
    {
        if(n<=0)
        {
            return 1;
        }
        return n%10 *digits(n/10);
    }

}
