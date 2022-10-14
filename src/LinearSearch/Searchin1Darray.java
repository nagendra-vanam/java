package LinearSearch;

public class Searchin1Darray {
    public static void main(String[] args) {
        int[] arr={4,8,9,45,2,1};
        int target=100;
        System.out.println(search(arr,target));

    }
    static Boolean search(int[] arr,int target)
    {
        for(int index=0;index<arr.length;index++)
        {
            if(arr[index]==target)
            {
                return true;
            }
        }
        return false;
    }
}
