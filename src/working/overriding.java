package working;

public class overriding {
    public static void main(String[] args) {

    }
    final static void pen()
    {
        System.out.println("this is from parent class");
    }
}
class pen1 extends overriding{
    public static void main(String[] args) {
        pen();
    }
    static void pen()
    {
        System.out.println("this is from child class");
    }
}
