class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();

        HashMap<Character, Integer> map = new HashMap<>();

        int maxLen = 0;
        int len = 0;
        int k = 0;

        for(int i = 0; i<n ; i++){
            char ch = s.charAt(i);
            if(!map.containsKey(ch)){
                map.put(ch , 1);
                len++;
            }
            else{
                while(!map.isEmpty() && map.containsKey(ch)){
                    map.remove(s.charAt(k));
                    len--;
                    k++;
                }
                map.put(ch , 1);
                len++;
            }
            maxLen = Math.max(len, maxLen);
        }

        return maxLen;
    }
}