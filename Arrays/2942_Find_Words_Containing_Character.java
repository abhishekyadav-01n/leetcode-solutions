class Solution {
    public int findGCD(int[] nums) {
        int n = nums.length;

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i<n ; i++){
            max = Math.max(max,nums[i]);
            min = Math.min(min,nums[i]);
        }
        while(min>0){
            int x = max % min;
            if(x == 0){
                break;
            }
            max = min;
            min = x;
        }
        return min;
    }
}
