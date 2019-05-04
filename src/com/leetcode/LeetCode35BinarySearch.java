package com.leetcode;

class Solution {

    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length -1;
        int mid=0;
        if(nums[0] > target)return 0;
        if(nums[nums.length-1] < target) return nums.length;
        while(low < high){
            mid = (low + high)/2;
            if(nums[mid] < target){
                low = mid + 1;
            }
            else {
                high = mid;
            }
        }
        return low;
    }

}