package com.Sorting;

import java.util.*;

public class IntersectionofTwoArrays {


        public static int[] intersection(int[] nums1, int[] nums2) {
            Arrays.sort(nums1);
            Arrays.sort(nums2);
            ArrayList list = new ArrayList();
            int i=0,j=0,lastNum=-1;
            while(i<nums1.length && j<nums2.length){
                if(lastNum!=nums1[i] && nums1[i]==nums2[j]){
                    list.add(nums1[i]);
                    lastNum=nums1[i];
                    i++;
                    j++;
                }
                else if(nums1[i]>nums2[j]){
                    j++;
                }else{
                    i++;
                }
            }

            int[] ans = new int[list.size()];
            for (int k = 0; k < list.size(); k++) {
                ans[k] =(int) list.get(k);
            }

            return ans;
        }


    public static void main(String[] args) {
        int[] nums1={4,9,5},nums2={9,4,9,8,4};
        String ans=Arrays.toString(intersection(nums2, nums1));
        System.out.println(ans);
    }

}