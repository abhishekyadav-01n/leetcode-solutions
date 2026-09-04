class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left = 0;
        int right = 0;

        for(int weight : weights){
            left = Math.max(weight , left);
            right += weight;
        }

        while(left <= right){
            int mid = left + (right - left) / 2;
            int requireDays = 1;
            int currentWeights = 0;

            for(int weight : weights){
                if(currentWeights + weight > mid){
                    requireDays++;
                    currentWeights = 0;
                }
                currentWeights += weight;
            }
            if(requireDays <= days){
                right = mid-1;
            }
            else{
                left = mid+1;
            }

        }
        return left;
    }
}