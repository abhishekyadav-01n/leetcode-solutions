class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int ans = 0;

        int freq[] = new int[26];
        int maxFreq = 0;
        int left = 0;

        for(int right = 0; right < n ; right++){
            int idx = s.charAt(right) - 'A';
            freq[idx]++;

            maxFreq = Math.max(maxFreq , freq[idx]);
            int windowLength = right - left + 1;
            int replacement = windowLength - maxFreq;

            while(replacement > k){
                freq[s.charAt(left) - 'A']--;

                left++;
                windowLength = right - left + 1;
                replacement = maxFreq - windowLength;
            }
            ans = Math.max(ans , windowLength);
        }
        return ans;
    }
}