package Recursion;

public class Stringoperations {
    public static void main(String[] args) {
        String str="nagendra";
        String res="";
        char letter='a';
        skip(str,res,0,letter);
    }
    static void skip(String str,String res ,int i,char letter)
    {
        if(str.isEmpty())
        {
            System.out.println(res);
            return;
        }
        if(str.charAt(0)==letter)
        {
             skip(str.substring(1),res,i+1,letter);
        }
        else{
             skip(str.substring(1),res+str.charAt(0),i+1,letter);
        }

    }
}
