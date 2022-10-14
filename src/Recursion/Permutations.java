package Recursion;

public class Permutations {
    public static void main(String[] args) {
        String up="abc";
        String p="";
        permu(up,p);
    }
    static void permu(String up,String p)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        for(int i=0;i<=p.length();i++)
        {
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
            permu(up.substring(1),f+ch+s);
        }
    }
}
