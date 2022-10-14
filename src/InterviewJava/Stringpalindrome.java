package InterviewJava;

public class Stringpalindrome {
    public static void main(String[] args) {
        String str="maddam";
        int i=0;
        int j=str.length()-1;
        System.out.println(palin(str,i,j));
    }
    static Boolean palin(String str,int i,int j)
    {
        if(i>=j)
        {
            return true;
        }

        return (str.charAt(i)==str.charAt(j)) && palin(str,i+1,j-1);
    }
}
