package LinearSearch;

public class Maxvaluein2Darray {
    public static void main(String[] args) {
        int[][] arr={
                {1,5,8,4},
                {2,5,8},
                {1,6,9}
        };
        int ans=maxvalue(arr);
        System.out.println(ans);
    }
    static int maxvalue(int[][] arr)
    {
        int max=Integer.MIN_VALUE;
        for(int row=0;row<arr.length;row++)
        {
            for(int column=0;column<arr[row].length;column++)
            {
                if(max<arr[row][column])
                {
                    max=arr[row][column];
                }
            }
        }
        return max;
    }

}
