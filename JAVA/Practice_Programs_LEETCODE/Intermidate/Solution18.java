package JAVA.Practice_Programs_LEETCODE.Intermidate;

import java.util.*;

public class Solution18 {
      public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
       if(nums.length < 4) return result;
       int n = nums.length;
       Arrays.sort(nums);
       for(int i = 0 ; i < n-3 ; i++){
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
        for(int j = i+1 ; j < n-2 ; j++){
            if(j > i+1 && nums[j] == nums[j-1]){
                continue;
            }

            int left = j + 1;
            int right = n - 1;

            while(left < right){
                long sum = 1L * nums[i] + nums[j] + nums[left] + nums[right];

                if(sum == target){
                    result.add(Arrays.asList(nums[i] , nums[j] , nums[left] , nums[right]));
                    while(left < right && nums[left] == nums[left+1]){
                        left++;
                    }
                     while(left < right && nums[right] == nums[right-1]){
                        right--;
                    }
                    left++;
                    right--;
                }else if(sum > target){
                    right--;
                }else{
                    left++;
                }
            }
         }
      }
      return result;
    }
}
