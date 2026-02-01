class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) return x;

        int left = 1, right = x;
        int ans = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // use long to avoid overflow
            if ((long) mid * mid <= x) {
                ans = mid;          // mid could be answer
                left = mid + 1;     // try bigger
            } else {
                right = mid - 1;    // try smaller
            }
        }
        return ans;
    }
}
