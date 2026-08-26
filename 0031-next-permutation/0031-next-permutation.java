class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;

        // find first decreasing element from right
        int i = n-2;

        for( ; i>=0 && nums[i] >= nums[i+1] ; i--);
        // we got i as a first decreasing element

        //find the smallest element greater than nums[i]
        if(i>=0){
            int j = n-1;

            while(nums[j] <= nums[i]) j--; //nums[j] --> the element we got

            //swap
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

        // Reverse the element after i
        int left = i+1;
        int right = n-1;

        while(left < right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}