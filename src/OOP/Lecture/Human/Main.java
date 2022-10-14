package OOP.Lecture.Human;

public class Main {
    public static void main(String[] args) {
        Human h1=new Human(25,"kunal",600000);
        System.out.println(h1.population);
        Human h2=new Human(26,"Rahul",600000);

        System.out.println(h2.population);
        article();
        Main obj=new Main();
        obj.greeting();
//        greeting();
    }
    void greeting()
    {
        article();
        System.out.println("hello i am working");
    }
    static void article()
    {
        System.out.println("this is to inform u i am learning java");
    }
}
