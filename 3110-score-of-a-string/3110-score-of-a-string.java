class Solution {
    public int scoreOfString(String s) {
        int n = s.length();
        int sum = 0;
        char a = s.charAt(0);
        for(int i = 1; i<n ; i++){
            int x = (int)s.charAt(i) - (int)a;
            sum += Math.abs(x);
            a = s.charAt(i);
        }
        return sum;
    }
}