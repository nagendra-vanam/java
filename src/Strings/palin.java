package Strings;

public class palin {
    public static void main(String[] args) {

       String s="madan is good";
       String rev="";
       char[] c=(s.toCharArray());
       int j=s.length()-1;
       while(j>=0)
        {
            rev=rev+c[j];
            j--;
        }
        System.out.println(rev);

    }
}
