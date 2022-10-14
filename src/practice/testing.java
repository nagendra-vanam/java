package practice;

public class testing {
    public static void main(String[] args) {
        polymorphisim p1=new polymorphisim();
        System.out.println(p1.l);
        polymorphisim p2=new polymorphisim(8);
        System.out.println(p2.l);
        polymorphisim p3=new polymorphisim(2,3,4);
        System.out.println(p3.h);
        polymorphisim p4=new polymorphisim(p1);
        System.out.println(p4.b);
        System.out.println(sum(2,3));
        System.out.println(sum(2,3,6));
    }
    static int sum(int a,int b)
    {
        return a+b;
    }
    static int sum(int a,int b,int c)
    {
        return a+b+c;
    }

}
