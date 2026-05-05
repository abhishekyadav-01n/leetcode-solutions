class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;

        int left = 0;
        int right = n-1;

        if (n==1) return nums[0];

        while(left <= right){

            int mid = left + (right - left) / 2;

            if(mid == 0 && nums[mid] != nums[mid+1]) return nums[mid];
            if(mid == n-1 && nums[mid] != nums[mid-1]) return nums[mid];

            if(nums[mid] != nums[mid-1] && nums[mid] != nums[mid+1]){
                return nums[mid];
            }
            else if(mid % 2 == 0){
                if(nums[mid] == nums[mid-1]){
                    right = mid - 1;
                }
                else{
                    left = mid+1;
                }
            }
            else{
                if(nums[mid] == nums[mid+1]){
                    right = mid-1;
                }
                else{
                    left = mid+1;
                }
            }
        }
        return -1;
    }
}
