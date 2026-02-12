class Solution {
    public boolean isPalindrome(String s) {
        String x = s.replaceAll("[^a-zA-Z0-9]", "");
        x = x.toLowerCase();
        int n = x.length();

        for(int i = 0; i<n/2; i++){
            if(x.charAt(i) != x.charAt(n-i -1)){
                return false;
            }
        }
        return true;
    }
}