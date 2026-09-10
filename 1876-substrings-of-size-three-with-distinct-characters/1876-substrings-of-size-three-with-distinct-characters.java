class Solution {
    public int countGoodSubstrings(String s) {
        int n = s.length();
        int count = 0;
        int freq[] = new int[26];
        int ans = 0;
        int left = 0;

        for(int i = 0; i<n ; i++){
            char ch = s.charAt(i);

            freq[ch - 'a']++;
            count++;

            while(freq[ch - 'a'] > 1 || i-left+1 > 3){
                freq[s.charAt(left)-'a']--;
                count--;
                left++;
            }

            if(count == 3){
                ans++;
            }
        }
        return ans;
    }
}