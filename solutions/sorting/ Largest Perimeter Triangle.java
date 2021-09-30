class Solution {
    public static int largestPerimeter(int[] nums) {
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j >0 ; j--) {

                if(nums[j]<nums[j-1]) swapfun(nums, j, j - 1);
                else
                    break;
            }
        }
        int ans=0;
        for(int i=nums.length-1;i>=2;i--)
        {
            if(nums[i-1] + nums[i-2] > nums[i])
                return nums[i] + nums[i-1] + nums[i-2];
        }
        return 0;

    }
    public static void swapfun(int[] nums,int i ,int j) {
        int temp=0;
        temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;

    }}