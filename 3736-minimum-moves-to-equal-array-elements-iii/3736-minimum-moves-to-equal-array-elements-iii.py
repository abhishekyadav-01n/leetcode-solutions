class Solution:
    def minMoves(self, nums: List[int]) -> int:
        ans = 0
        max_value = max(nums)

        for i in range(len(nums)):
            ans += (max_value - nums[i])

        return ans