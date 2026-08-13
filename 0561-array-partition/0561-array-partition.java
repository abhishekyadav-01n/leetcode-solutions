class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);

        int ans = 0;

        for(int i = nums.length-1 ; i>=0 ; i--){
            if(i % 2 == 0) ans += nums[i];
        }
        return ans;
    }
}