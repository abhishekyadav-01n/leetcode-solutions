class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left = 0, right = 0;

        for(int num : weights){
            left = Math.max(num, left);
            right += num;
        }

        while(left <= right){
            int mid = left + (right - left) / 2;

            int reqDays = 1;
            int currWeight = 0;

            for(int weight : weights){
                if(currWeight + weight > mid){
                    reqDays++;
                    currWeight = 0;
                }
                currWeight += weight;
            }

            if(reqDays <= days){
                right = mid-1;
            }
            else{
                left = mid+1;
            }

        }
        return left;
    }
}