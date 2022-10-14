package LinearSearch;

public class Evennumberofdigits {
    public static void main(String[] args) {
        int[] nums={240,0,6890,56,816};
       int ans= even(nums);
        System.out.println(ans);
    }
    static int even(int[] nums)
    { int count=0;
        for(int i=0;i<nums.length;i++)
        {    if(nums[i]<0)
        {
            nums[i]=nums[i]*-1;
        }
            int subcount=0;
            while(nums[i]>0)
            {
                nums[i]=nums[i]/10;
                subcount++;
            }
            if(subcount%2==0&&subcount>0)
            {
                count++;
            }
        }
        return count;
    }
}
