package Recursion;

import java.util.ArrayList;

public class seqi {
    public static void main(String[] args) {
        String up="abc";
        String p="";
     ArrayList<String> list=new ArrayList<>();
        seq(up,p,list);
        System.out.println(strss);

    }
    static ArrayList<String> strss=new ArrayList<>();
    static void seq(String up,String p,ArrayList<String> list)
    {
        if(up.isEmpty())

        {

            strss.add(p);
            return;
        }
        char ch=up.charAt(0);
         seq(up.substring(1),p+ch,list);
         seq(up.substring(1),p,list);

    }
}
