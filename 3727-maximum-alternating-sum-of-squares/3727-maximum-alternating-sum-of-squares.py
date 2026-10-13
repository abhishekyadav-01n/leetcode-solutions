class Solution:
    def maxAlternatingSum(self, nums: List[int]) -> int:
        for i in range(len(nums)):
            if nums[i] < 0:
                nums[i] = -nums[i]
            
        nums.sort()

        ans = 0

        i = 0
        j = len(nums)-1

        while i < j:
            ans += (nums[j] * nums[j])
            ans -= (nums[i] * nums[i])

            i += 1
            j -= 1
        
        if(len(nums) % 2 != 0):
            ans += (nums[j] * nums[j])

        return ans