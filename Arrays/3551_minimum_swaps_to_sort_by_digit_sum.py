class Solution:
    def minSwaps(self, nums: list[int]) -> int:
        def digit_sum(x):
            return sum(int(d) for d in str(x))

        arr = sorted(nums, key=lambda x: (digit_sum(x), x))
        nums = nums[:]

        pos = {num: i for i, num in enumerate(nums)}
        swaps = 0

        for i in range(len(nums)):
            if nums[i] != arr[i]:
                j = pos[arr[i]]

                pos[nums[i]] = j
                pos[arr[i]] = i

                nums[i], nums[j] = nums[j], nums[i]
                swaps += 1

        return swaps
