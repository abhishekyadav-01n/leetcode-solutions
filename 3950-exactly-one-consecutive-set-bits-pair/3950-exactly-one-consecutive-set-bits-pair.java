class Solution {
    public boolean consecutiveSetBits(int n) {
        String s = Integer.toBinaryString(n);
        int len = s.length();
        int count = 0;

        for(int i = 1; i<len ; i++){
            if(s.charAt(i) == '1' && s.charAt(i-1) == '1'){
                count++;
            }
        }
        return count == 1;
    }
}