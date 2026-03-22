class Solution {
    public int countPartitions(int[] nums) {
        int n = nums.length;
        int count = 0;
        for(int i = 0; i<n ; i++){
            if(nums[i] % 2 != 0){
                count++;
            }
        }
        if(count % 2 == 0){
            return n-1;
        }
        else{
            return 0;
        }
    }
}