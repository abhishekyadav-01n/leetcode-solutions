class Solution { //brute force
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n == 0) return 0;

        Arrays.sort(nums);

        int len =  1;
        int maxLen = 1;

        for(int i = 1 ; i<n ; i++){
            if(nums[i] == nums[i-1]){
                continue;
            }
            else if(nums[i] - 1 == nums[i-1]){
                len++;
            }
            else{
                len = 1;
            }
            
            maxLen = Math.max(maxLen, len);
        }
        return maxLen;
    }
}