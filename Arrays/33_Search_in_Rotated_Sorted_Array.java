class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;

        int left = 0,right = n-1;

        while(left < right){
            int mid = left + (right - left) / 2;

            if(nums[mid] > nums[right]){
                left = mid+1;
            }
            else{
                right = mid;
            }
        }

        int pivot = left;

        int start = 0;
        int end = n-1;

        while(start<=end){
            int mid = start + (end-start)/2;
            int realMid = (pivot + mid) % n ;
            if(nums[realMid] == target){
                return realMid;
            }
            else if(nums[realMid] > target){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }

        
        return -1;
    }
}