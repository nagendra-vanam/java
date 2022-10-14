package LinearSearch;

public class Maxwealth {
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3},
                {4,15,6},
                {7,9,30}
        };
        int ans=maximumwealth(arr);
        System.out.println(ans);
    }
    static int maximumwealth(int[][] arr)
    {
        int max=Integer.MIN_VALUE;

        for(int row=0;row<arr.length;row++)
        { int sum=0;
            for(int column=0;column<arr[row].length;column++)
            {
                sum=sum+arr[row][column];
            }
            if(sum>max)
            {
                max=sum;
            }
        }
        return max;
    }
}
