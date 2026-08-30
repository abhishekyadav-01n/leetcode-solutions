class Solution {
    public String minWindow(String s, String t) {
        if(t.length() > s.length()) return "";

        char ch[] = t.toCharArray();

        int freq[] = new int[128];

        for(int i = 0; i<t.length() ; i++){
            char c = t.charAt(i);
            freq[(int)c]++;
        }
        
        int left = 0;
        int count = 0;

        int minLen = Integer.MAX_VALUE;
        int start = 0;
        
        for(int right = 0; right < s.length() ; right++){
            char c = s.charAt(right);

            if(freq[c] > 0){
                count++;
            }

            freq[c]--;

            while(count == t.length()){
                if(right - left + 1 < minLen){
                    minLen = right - left + 1;
                    start = left;
                }

                char charset = s.charAt(left);
                freq[charset]++;

                if(freq[charset] > 0){
                    count--;
                }

                left++;
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(start , start + minLen);
    }
}