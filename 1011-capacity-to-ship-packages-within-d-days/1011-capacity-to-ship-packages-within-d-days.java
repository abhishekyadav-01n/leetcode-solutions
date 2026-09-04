class Solution {
    public boolean canShip(int weights[] , int days, int capacity){
        int reqDays = 1;
        int currWeight = 0;

        for(int weight : weights){
            if(currWeight + weight > capacity){
                reqDays++;
                currWeight = 0;
            }
            currWeight += weight;
        }
        return reqDays <= days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int left = 0, right = 0;

        for(int num : weights){
            left = Math.max(num, left);
            right += num;
        }

        while(left < right){
            int mid = left + (right - left) / 2;

            if(canShip(weights ,days,mid)){
                right = mid;
            }
            else{
                left = mid+1;
            }
        }
        return left;
    }
}