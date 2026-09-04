class Solution {
    public boolean canSplit(int nums[], int k , long maxSum){
        int split = 1;
        long sum = 0;

        for(int num : nums){
            if(sum + num > maxSum){
                split++;
                sum = 0;
            }
            sum += num;
        }
        return split <= k;
    }
    public int splitArray(int[] nums, int k) {
        int left = 0;
        long right = 0;

        for(int num : nums){
            left = Math.max(left , num);
            right += num;
        }

        while(left < right){
            long mid = left + (right - left) / 2;

            if(canSplit(nums , k , mid)){
                right = mid;
            }
            else{
                left =(int) mid+1;
            }
        }
        return left;
    }
}