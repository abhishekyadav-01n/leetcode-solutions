class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;//min speed 
        int right = 0; //max speed

        for(int num : piles){
            right = Math.max(num , right);
        }

        while(left < right){
            int mid = left + (right - left) / 2;

            long hours = 0;
            for(int num : piles){
                hours += (num + mid - 1) / mid;
            }

            if(hours <= h){
                right = mid;
            }
            else{
                left = mid+1;
            }
        }
        return left;
    }
}