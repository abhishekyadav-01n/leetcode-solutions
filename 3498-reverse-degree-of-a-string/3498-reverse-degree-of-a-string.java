class Solution {
    public int reverseDegree(String s) {
        int count = 0;
        for(int i = 0; i<s.length() ; i++){
            char ch = s.charAt(i);
            int x = 'z' - ch + 1;
            count += (i+1) * x;
        }
        return count;
    }
}