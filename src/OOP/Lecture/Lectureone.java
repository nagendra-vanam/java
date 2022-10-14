package OOP.Lecture;

public class Lectureone {
    //class named group of properties and methods// creating own data type  //logical constraint
    //class starts with capital letter
    public static void main(String[] args) {
        Student student1=new Student();
        Student student2=new Student(2,"suresh",97.25f);
        Student student3=new Student(student2);
        System.out.println(student3.marks);
    }
}
class Student{
    int rollno;
    String name;
    Float marks;
    Student()
    {
//        this.marks= Float.valueOf(95);
//        this.rollno=1;
//        this.name="Mahesh";
        this(89,"helloguru",89.607f);
    }
    Student(Student other)
    {
        this.name=other.name;
        this.marks=other.marks;
        this.rollno= other.rollno;
    }
    Student(int roll,String name,Float marks)
     {
        this.marks=marks;
        this.rollno=roll;
        this.name=name;
    }
}
