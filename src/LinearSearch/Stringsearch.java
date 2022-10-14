package LinearSearch;

public class Stringsearch {
    public static void main(String[] args) {
        String str="java";
        char target='z';
        Boolean ans=Stringsear(str,target);
        System.out.println(ans);
    }
    static Boolean Stringsear(String str, char target)
    {
     for(int index=0;index<str.length();index++)
     {
         if(target==str.charAt(index))
         {
             return true;
         }
     }
     return false;
    }
}
