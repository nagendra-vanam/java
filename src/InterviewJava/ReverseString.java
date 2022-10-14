package InterviewJava;

public class ReverseString {
    public static void main(String[] args) {
        String str="nagendra";
        int i=0;
        int j=str.length()-1;
        System.out.println(reverse(str,i,j));
    }
    static String reverse(String str,int i,int j)
    {
        String rev="";
        while(j>=0)
        {
            rev=rev+str.charAt(j);
            j--;
        }
        return rev;
    }
}
