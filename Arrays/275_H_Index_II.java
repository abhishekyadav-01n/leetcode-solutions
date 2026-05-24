class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        int left = 0, right = n - 1;
        int ans = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (citations[mid] >= n - mid) {
                ans = n - mid;   // possible answer
                right = mid - 1; // try to find smaller index
            } else {
                left = mid + 1;
            }
        }

        return ans;
    }
}
