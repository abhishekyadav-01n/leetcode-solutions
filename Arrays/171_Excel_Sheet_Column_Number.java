class Solution {
    public int titleToNumber(String columnTitle) {
        int n = columnTitle.length();
        int a;
        int sum = 0;
        for(int i = 0; i<n ; i++){
            a = columnTitle.charAt(i) - 'A' + 1;
            sum = 26*sum  + a;
        }
        return sum;
    }
}