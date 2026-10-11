class Solution:
    def sumOfSquares(self, nums: List[int]) -> int:
        ans = 0

        for num in range(len(nums)):
            if(len(nums) % (num+1) == 0):
                ans += (nums[num] * nums[num])
            
        return ans
