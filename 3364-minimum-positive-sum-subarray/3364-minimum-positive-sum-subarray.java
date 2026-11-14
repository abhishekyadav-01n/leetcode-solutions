
class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n = nums.size();
        int ans = Integer.MAX_VALUE;

        for (int len = l; len <= r; len++) {

            int sum = 0;
            int i = 0, k = 0;

            // Initial window
            while (i < len) {
                sum += nums.get(i);
                i++;
            }

            if (sum > 0) {
                ans = Math.min(ans, sum);
            }

            // Sliding window
            while (i < n) {
                sum += nums.get(i);
                sum -= nums.get(k);

                i++;
                k++;

                if (sum > 0) {
                    ans = Math.min(ans, sum);
                }
            }
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}
