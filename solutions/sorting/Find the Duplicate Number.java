class Solution {
    public int findDuplicate(int[] nums) {

        int cp,i=0;
     
        while(i<nums.length){

           cp=nums[i]-1;
            if(nums[i]!=nums[cp]){
                swap(nums,i,cp);
                
            }
            else
                i++;
            
           }
        for (int j=0;j<nums.length;j++){
            if(nums[j]!=j+1)
                return nums[j];
  
       
}
        return 0;
    }
    void swap(int[]arr,int f,int s){
        int t=0;
        t=arr[f];
        arr[f]=arr[s];
        arr[s]=t;
    }
}
   
