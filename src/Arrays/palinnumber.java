package Arrays;

public class palinnumber {
    public static void main(String[] args) {
        int number=7;
        palinn(number);
    }
    static void palinn(int number){
        int num=0;
        int original=number;
        while(number>0)
        {
            int k=number%10;
            num=num*10+k;
            number=number/10;
        }
        System.out.println(num);
        if(original==num)
        {
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}
