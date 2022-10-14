package OOP.Lecture.Human;


//demo to intilize
public class StaticInt {
    static int a=4;
    static int b;
    static{// only run once when first obj is created
        System.out.println("i am in static block");
        b=a*5;
    }

    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(b);
    }
}
