class Solution {
    public int thirdMax(int[] nums) {
        for(int i =0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]>nums[j]){
                 int t=nums[i];
                 nums[i]=nums[j];
                    nums[j]=t;
                }
            }
        }
        int k=0;
        int[] sol=new int[nums.length];
for(int i =0;i<nums.length-1;i++){
    if(nums[i]!=nums[i+1]){
        sol[k]=nums[i];
        k++;
    }
}
        sol[k]=nums[nums.length-1];
   if(k>=2)    
       return sol[k-2];
    else
        return sol[k];
        
   
}
}
