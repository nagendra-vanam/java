package InterviewJava;

public class Fibbi {
    public static void main(String[] args) {
        int n=6;
        System.out.println(fibbinocci(n));
    }
    static int fibbinocci(int n)
    {
        if(n<2)
        {
            return n;
        }
        return fibbinocci(n-1)+fibbinocci(n-2);
    }

}
