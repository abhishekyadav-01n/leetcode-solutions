class Solution:
    def scoreOfParentheses(self, s: str) -> int:
        ans = 0
        depth = 0
        x = False

        for i in range(len(s)):
            if(s[i] == '('):
                depth = 1 if depth == 0 else 2*depth
                x = True
            else:
                if(x):
                    ans += depth
                depth //= 2
                x = False
        return ans