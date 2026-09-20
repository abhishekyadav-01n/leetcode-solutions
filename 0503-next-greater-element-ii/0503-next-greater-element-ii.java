class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        Stack<Integer> stack = new Stack<>();

        Arrays.fill(ans , -1);

        for(int i = 2*n-1 ; i>=0 ; i--){
            int idx = i % n;

            while(!stack.isEmpty() && nums[idx] >= stack.peek()){
                stack.pop();
            }

            if(!stack.isEmpty() && i < n){
                ans[idx] = stack.peek();
            }
            stack.push(nums[idx]);
        }
        return ans;
    }
}