package controlflow;

import java.sql.SQLOutput;
import java.util.Scanner;

public class swaptwonumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number");
        int a=sc.nextInt();
        System.out.println("enter second number");
        int b=sc.nextInt();
        int temp=a;
        a=b;
        b=temp;
        System.out.println(a);
        System.out.println(b);

    }
}
