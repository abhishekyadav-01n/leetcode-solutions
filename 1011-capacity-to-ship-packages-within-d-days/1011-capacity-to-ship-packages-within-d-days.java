class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left = 0;
        int right = 0;

        for(int num : weights){
            left = Math.max(num , left);
            right += num;
        }

        while(left < right){
            int mid = left + (right - left) / 2;
            int sum = 0;
            int split = 1;

            for(int num : weights){
                if(sum + num > mid){
                    split++;
                    sum = 0;
                }
                sum += num;
            }

            if(split <= days){
                right = mid;
            }
            else{
                left = mid+1;
            }
        }
        return left;
    }
}