package InterviewJava;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr={1,5,3,4,6,7,8,9};
        System.out.println(Missing(arr));
    }
    static int Missing(int[] arr)
    {
        int len=arr.length+1;
        int sum=(len)*(len+1)/2;
        int arrsum=0;
        for(int index=0;index<arr.length;index++)
        {
         arrsum=arrsum+arr[index];
        }
        return sum-arrsum;
    }
}
