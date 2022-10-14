package Recursion;

import java.util.ArrayList;

public class subsequences {
    public static void main(String[] args) {
        String up="abc";
        String p="";
        ArrayList<String> ans=  seq(up,p);
        System.out.println(seq(up,p));
    }
    static ArrayList<String> seq(String up,String p)
    {ArrayList<String> list=new ArrayList<>();
        if(up.isEmpty())

        {

            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        ArrayList<String>left= seq(up.substring(1),p+ch);
        ArrayList<String>right=seq(up.substring(1),p);
        left.addAll(right);
        return left;
    }
}
