package practice;

public class polymorphisim {
    int l;
    int b;
    int h;

    public polymorphisim(int l, int b, int h) {
        this.l = l;
        this.b = b;
        this.h = h;
    }
    polymorphisim()
    {
        this.l=-1;
        this.h=-1;
        this.b=-1;
    }
    polymorphisim(int size)
    {
        this.l=size;
        this.h=size;
        this.b=size;
    }
    polymorphisim(polymorphisim other)
    {
        this.l=other.l;
        this.b=other.b;
        this.h=other.h;
    }

}
