class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> Sol=new ArrayList();
int i=0,cp;
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
               Sol.add(nums[j]) ;
  
       
}
        return Sol;
    }
    void swap(int[]arr,int f,int s){
        int t=0;
        t=arr[f];
        arr[f]=arr[s];
        arr[s]=t;
    }
  
    

    }
