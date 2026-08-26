class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;

        int freq[] = new int[1000002];
        for(int i = 0; i<n ; i++){
            if(nums[i] >= 0 && nums[i] <= 100000){
                freq[nums[i]]++;
            }
        }
        for(int i = 1; i < 100002 ; i++){
            if(freq[i] == 0) return i;
        }
        return -1;
    }
}