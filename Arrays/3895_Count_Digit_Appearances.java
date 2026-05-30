class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int count = 0;
        for(int i = 0; i<nums.length ; i++){
            int x = nums[i];
            while(x != 0){
                int rem = x % 10;
                if(rem == digit) count++;
                x /= 10;
            }
        }
        return count;
    }
}
