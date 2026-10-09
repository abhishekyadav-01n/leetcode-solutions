class Solution:
    def checkDivisibility(self, n: int) -> bool:
        d_sum = 0
        d_prod = 1

        num = n

        while( num != 0):
            rem = num % 10
            d_sum += rem
            d_prod *= rem

            num = num // 10

        if n % (d_sum + d_prod) == 0:
            return True
        
        return False