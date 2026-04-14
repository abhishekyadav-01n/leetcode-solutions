class Solution {
    public int minElement(int[] nums) {
        int min = Integer.MAX_VALUE;
        int n = nums.length;
        for(int i = 0; i<n ; i++){
            int a = nums[i];
            int value = 0;
            while(a>0){
                int rem = a % 10;
                value += rem;
                a /= 10;
            }
            min = Math.min(min, value);
        }
        return min;
    }
}
