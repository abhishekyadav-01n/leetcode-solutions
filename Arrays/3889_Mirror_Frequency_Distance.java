class Solution {
    public int mirrorFrequency(String s) {
        int freq[] = new int[36];

        for(char ch : s.toCharArray()){
            if(ch >= '0' && ch <= '9'){
                freq[ch - '0']++;
            }
            else{
                freq[10 + ch - 'a']++;
            }
        }
        int ans = 0;

        for(int i = 0; i<13 ; i++){
            int mirror = 25 - i;
            ans += Math.abs(freq[10 + i] - freq[10 + mirror]);
        }
        for(int i = 0; i<=4 ; i++){
            int mirror = 9 - i;
            ans += Math.abs(freq[i] - freq[mirror]);
        }
        return ans;
    }
}
