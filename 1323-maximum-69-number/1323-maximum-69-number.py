class Solution:
    def maximum69Number (self, num: int) -> int:
        rev = 0

        while(num != 0):
            rev = rev * 10 + num % 10
            num //= 10
        
        ans = 0
        change = 1

        while rev != 0:
            rem = rev % 10
            if(change > 0 and rem == 6):
                change -= 1
                ans = ans * 10 + 9
                rev //= 10
                continue
            
            ans = ans * 10 + rem
            rev //= 10
    
        return ans