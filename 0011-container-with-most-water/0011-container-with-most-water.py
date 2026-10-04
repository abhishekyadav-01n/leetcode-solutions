class Solution:
    def maxArea(self, height: list[int]) -> int:
        result = 0

        i = 0
        j = len(height)-1

        while i < j:
            width = j - i

            length = min(height[i],height[j])

            result = max(result , length * width)

            if(height[i] < height[j]):
                i += 1
            else:
                j -= 1
        
        return result