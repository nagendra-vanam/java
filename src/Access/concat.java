package Access;

public class concat {
    public static void main(String[] args) {
        System.out.println(search("cdab"));
    }
    static int search(String str)
    {
       String kstr="abcdabcd";
        if(kstr.contains(str))
        {
            return kstr.indexOf(str);
        }
        return -1;
    }
}
