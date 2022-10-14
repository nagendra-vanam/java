package working;

public class poly {
     int k;
    int l;
    int b;
    int h;

    public poly(int l, int b, int h) {
        this.l = l;
        this.b = b;
        this.h = h;
    }
    public poly(int l)
    {
        this.l=l;
    }

}
class calculation{
    public static void main(String[] args) {
        System.out.println(area(3,4));
        System.out.println(area(3,4,5));
    }
    static int area(int a,int b)
    {
        return a*b;
    }
    static int area(int a,int b,int c)
    {
        return a*b*c;
    }
}

