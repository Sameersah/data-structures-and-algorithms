package com.sameer.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 * <p>
 * Example 1:
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 * */

/*
* nums
* target
* put in hashmaap
* loop and check
* if found return indicies
* O(N),O(N)
* */

public class No1TwoSum {

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] res = twoSum(nums,target);
        System.out.println(Arrays.toString(res));

        nums = new int[]{3,2,4};
        target = 6;
        res = twoSum(nums,target);
        System.out.println(Arrays.toString(res));

    }

   public static int[] twoSum(int[] nums, int target) {
       Map<Integer,Integer> map = new HashMap<>();
       int[] res = new int[2];
       for(int i=0;i<nums.length;i++) {
           if(map.containsKey(target-nums[i])) {
               res[0] = map.get(target-nums[i]);
               res[1] = i;
               break;
            } else {
               map.put(nums[i],i);
           }

       }
       return res;

   }
}
