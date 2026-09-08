class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;

        double sum = 0;
        for(int i = 0; i < k ; i++){
            sum += nums[i];
        }

        int left = 0;
        double maxAvg = sum / k;

        for(int i = k; i<n ; i++){
            sum += nums[i];
            sum -= nums[left];
            left++;
            maxAvg = Math.max(maxAvg , sum / k);
        }
        return maxAvg;
    }
}