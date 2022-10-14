package Recursion;

public class Removeduplicates {
    public static void main(String[] args) {
        System.out.println(removeDups("kuup"));
    }
    static String removeDups(String S) {
        for(int index=0;index<S.length();index++)
        {
            int j=index+1;
            String ch= String.valueOf(S.charAt(index));
            System.out.println(ch);
            System.out.println(S.substring(j).contains(ch));

            if(S.substring(j).contains(ch))
            {

                S.replace(ch,"");
            }
        }
        return S;
    }
}


