package Arrays;

public class Armstrong {
    public static void main(String[] args) {
        int a=145;
        arm(a);
    }
    static void arm(int a)
    {    int sum=0;
        int number=a;
        while(a>0)
        {
            int k=a%10;
            sum=sum+(k*k*k);
            a=a/10;
            System.out.println(a);
        }
        if(sum==number)
        {
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}
