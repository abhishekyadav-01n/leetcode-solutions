class Solution:
    def majorityElement(self, nums: list[int]) -> list[int]:
        freq = {}
        result = []

        for num in nums:
            freq[num] = freq.get(num , 0) + 1

        for num in freq:
            if freq[num] > len(nums) / 3 :
                result.append(num)
        
        return result