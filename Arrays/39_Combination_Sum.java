class Solution {
    Set<List<Integer>> set = new HashSet<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(candidates, 0, target, new ArrayList<>(), ans);
        return ans;
    }
    private void helper(int[] arr, int idx, int target,
            List<Integer> curr, List<List<Integer>> ans) {

        // Base case
        if (idx == arr.length || target < 0) {
            return;
        }

        if (target == 0) {
            if (!set.contains(curr)) {
                ans.add(new ArrayList<>(curr));
                set.add(new ArrayList<>(curr));
            }
            return;
        }

        // Take current element (single)
        curr.add(arr[idx]);
        helper(arr, idx + 1, target - arr[idx], curr, ans);

        // Take current element again (multiple times allowed)
        helper(arr, idx, target - arr[idx], curr, ans);

        // Backtrack
        curr.remove(curr.size() - 1);

        // Skip current element
        helper(arr, idx + 1, target, curr, ans);
    }
}
