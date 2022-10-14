package Recursion;

public class Skipastring { public static void main(String[] args) {
    String str="nageapplendra";
    String res="";
    char letter='a';
    System.out.println(skip(str,res,0,letter));
}
    static String skip(String str,String res ,int i,char letter)
    {
        if(str.isEmpty())
        {

            return res;
        }
        if(str.startsWith("apple"))
        {
            return skip(str.substring(5),res,i+1,letter);
        }
        else{
            return skip(str.substring(1),res+str.charAt(0),i+1,letter);
        }

    }

}
