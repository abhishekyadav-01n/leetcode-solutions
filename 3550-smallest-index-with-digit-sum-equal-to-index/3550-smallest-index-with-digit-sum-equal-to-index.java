class Solution {
    public int smallestIndex(int[] nums) {
        int ans = -1;

        for(int i = 0; i<nums.length ; i++){
            int x = nums[i];
            int count = 0;
            while(x != 0){
                int rem = x % 10;
                count += rem;
                x /= 10;
            }
            if(count == i){
                ans = i;
                break;
            }
        }
        return ans;
    }
}