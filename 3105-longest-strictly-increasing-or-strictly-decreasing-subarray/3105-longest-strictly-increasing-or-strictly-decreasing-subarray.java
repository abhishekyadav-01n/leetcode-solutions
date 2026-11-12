class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int maxCount = 1;
        int count = 1;

        for(int i = 1; i<nums.length ; i++){
            if(nums[i] > nums[i-1]){
                count++;
            }
            else{
                count = 1;
            }
            maxCount = Math.max(count , maxCount);
        }
        count = 1;
        for(int i = nums.length - 2; i>=0 ; i--){
            if(nums[i] > nums[i+1]){
                count++;
            }
            else{
                count = 1;
            }
            maxCount = Math.max(count , maxCount);
        }

        return maxCount;
    }
}