package practice;

public class parent {
    public static void main(String[] args) {

    }
  void message()
  {
      System.out.println("hello world");
  }
}
class child extends parent{
    public static void main(String[] args) {
       parent n1=new parent();
       n1.message();
    }
//    static void message()
//    {
//        System.out.println("i am from child class");
//    }
}
