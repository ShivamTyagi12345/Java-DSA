class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i=0,j=nums.length-1;int[] arr=new int[nums.length];
        for(int num:nums){
            
            if(num%2==0){
                arr[i++]=num;
            }else{
                arr[j--]=num;
            }
        }
        return arr;
            
        }
    }
