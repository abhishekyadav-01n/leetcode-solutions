class Solution {
    public int peakIndexInMountainArray(int[] nums) {
        int n = nums.length;

        int left = 1;
        int right = n-2;

        while(left <= right){
            int mid = left + (right - left) / 2;

            if(nums[mid - 1] < nums[mid] && nums[mid] > nums[mid+1]){
                return mid;
            }
            else if(nums[mid-1] < nums[mid] && nums[mid] < nums[mid+1]){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return -1;
    }
}
