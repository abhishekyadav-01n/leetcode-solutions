class Solution:
    def scoreOfParentheses(self, s: str) -> int:
        ans = 0
        depth = 0
        stack = []
        x = False

        for i in range(len(s)):
            if(s[i] == '('):
                depth = 1 if len(stack) == 0 else 2*depth
                stack.append(s[i])
                x = True
            else:
                if(x):
                    ans += depth
                depth //= 2
                stack.pop()
                x = False
        return ans