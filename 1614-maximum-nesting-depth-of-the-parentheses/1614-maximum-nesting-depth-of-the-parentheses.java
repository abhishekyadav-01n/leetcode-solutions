class Solution {
    public int maxDepth(String s) {
        int max = 0;
        int n = 0;
        for(int i = 0; i<s.length() ; i++){
            char ch = s.charAt(i);
            if(ch == '('){
                n++;
            }
            else if(ch == ')'){
                n--;
            }
            max = Math.max(max , n);
        }
        return max;
    }
}