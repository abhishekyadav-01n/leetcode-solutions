class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int arr[]  =new int[n];

        int left = 0;
        int right = n-1;
        int idx = n-1;

        while(left <= right){
            int rightSq = nums[right] * nums[right];
            int leftSq = nums[left] * nums[left];

            if(leftSq > rightSq){
                arr[idx--] = leftSq;
                left++;
            }
            else{
                arr[idx--] = rightSq;
                right--;
            }
        }
        return arr;
    }

}