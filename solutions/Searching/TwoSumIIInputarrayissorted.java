package com.Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoSumIIInputarrayissorted {
    public static int[] twoSum(int[] numbers, int target) {
        int[] sol = new int[2];
        for (int i = 0; i < numbers.length - 1; i++) {
            int val = target - numbers[i], start = i + 1, end = numbers.length -1;
            sol[1]= binarySearch(numbers,start,end,val)+1;
            if(sol[1]!=0) {
                sol[0] = i + 1;
                break;
            }

        }
        return sol;
    }

    public static int binarySearch(int arr[], int l, int r, int x)
    {
        if (r >= l) {
            int mid = l + (r - l) / 2;

            // If the element is present at the
            // middle itself
            if (arr[mid] == x)
                return mid;

            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);

            // Else the element can only be present
            // in right subarray
            return binarySearch(arr, mid + 1, r, x);
        }

        // We reach here when element is not present
        // in array
        return -1;
    }

    public static void main(String[] args) {
        int[] num={2,7,11,15};
        int tar=9;

        System.out.println(Arrays.toString(twoSum(num,tar)));
    }
}
