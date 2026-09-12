class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();

        if(n > m) return false;

        int left = 0;
        int freq[] = new int[26];

        for(int i = 0; i<n ; i++){
            char ch = s1.charAt(i);
            freq[ch-'a']++;
        }

        int count = n;

        for(int right = 0; right < m; right++){
            char ch = s2.charAt(right);

            if(freq[ch - 'a'] > 0){
                count--;
            }

            freq[ch - 'a']--;

            if(right - left + 1 > n){
                char removed = s2.charAt(left);

                freq[removed - 'a']++;

                if(freq[removed - 'a'] > 0){
                    count++;
                }
                left++;
            }
            if(count == 0) return true;
        }
        return false;
    }
}