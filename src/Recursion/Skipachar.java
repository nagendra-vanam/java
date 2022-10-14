package Recursion;

public class Skipachar {
    public static void main(String[] args) {
        String str="nagendra";
        String res="";
        char letter='a';
        System.out.println(skip(str,res,0,letter));
    }
    static String skip(String str,String res ,int i,char letter)
    {
       if(str.length()==i)
       {
           return res;
       }
       if(str.charAt(i)==letter)
       {
           return skip(str,res,i+1,letter);
       }
       else{
           return skip(str,res+str.charAt(i),i+1,letter);
       }

    }
}
