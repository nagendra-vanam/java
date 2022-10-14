package Inheritance;

public class Box {

    int l;
    int w;
    int h;
    Box()
    {
        this.l=-1;
        this.w=-1;
        this.h=-1;
    }
    Box(int s){
        this.l=s;
        this.w=s;
        this.h=s;
    }

    Box(int l, int w, int h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }
    Box(Box old){
        this.l=old.l;
        this.w=old.w;
        this.h=old.h;

    }
  void info()
  {
      System.out.println("runing box");
  }

}
