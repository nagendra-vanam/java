package InterviewJava;

import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args) {
        String str1="teay";
        String str2="ate";
        System.out.println(ana(str1,str2));
    }
    static Boolean ana(String str1,String str2)
    {
        char[] first=str1.toCharArray();
        char[] second=str2.toCharArray();
        Arrays.sort(first);
        Arrays.sort(second);
        return Arrays.equals(first,second);
    }
}
