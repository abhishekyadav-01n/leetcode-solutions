class Solution {
    public int differenceOfSum(int[] nums) {
        int n = nums.length;
        int sumEle = 0;
        int sum = 0;
        for(int i = 0; i<n ; i++){
            int a = nums[i];
            sumEle += nums[i];
            while(a>0){
                int rem = a % 10;
                sum += rem;
                a = a/10;
            }
        }
        return Math.abs(sumEle - sum);
    }
}