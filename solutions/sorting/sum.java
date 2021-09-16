package com.Sorting;

import java.util.*;


public class sum {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length-2; i++) {
            // check-i, if i is repeated, then skip duplicate
            if(i>0 && nums[i] == nums[i-1]) continue;
            int j = i+1, k=nums.length-1;
            while(j<k) {
                int sum = nums[i]+nums[j]+nums[k];
                if(sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    //below two lines are for [-2,0,0,2,2] like scenario
                    while(j< k && nums[j] == nums[j+1]) j++; //check-j skip duplicates
                    while(j<k && nums[k] == nums[k-1]) k--; //check-k skip duplicates
                    j++; k--;
                }
                else if(sum<0) j++;
                else k--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        int[] num={-2,0,0,2,2};
        list=threeSum(num);
        System.out.println(list);

    }
}
