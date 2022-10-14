package Recursion;

public class Subsets {
    public static void main(String[] args) {
        String res="";
        String str="abc";
        sub(str,res);
    }
    static void sub(String str,String res)
    {
        if(str.isEmpty())

        {
            System.out.println(res);
            return ;
        }
        String dup= String.valueOf(str.charAt(0));
        sub(str.substring(1),res+dup);
        sub(str.substring(1),res);

    }
}
