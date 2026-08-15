class Solution {
    public int longestSubsequence(int[] nums) {
        int n = nums.length;
        
        int xor = 0;
        boolean hasNoneZero = false;
        for(int num : nums){
            xor ^= num;
        }

        if(xor != 0) return n;

        for(int num : nums){
            if(num != 0) return n-1;
        }

        return 0;
    }
}