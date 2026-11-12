class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int maxCount = 1;

        int incCount = 1;
        int decCount = 1;

        for(int i = 1; i<nums.length ; i++){
            if(nums[i] > nums[i-1]){ //Incresing
                incCount++;
            }
            else{
                incCount = 1;
            }

            if(nums[i] < nums[i-1]){ //Decreasing
                decCount++;
            }
            else{
                decCount = 1;
            }
            maxCount = Math.max(maxCount , Math.max(incCount , decCount));
        }

        return maxCount;
    }
}