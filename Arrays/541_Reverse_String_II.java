class Solution {
    public String reverseStr(String s, int k) {
        int n = s.length();
        
        for(int i = 0; i<n ; i += 2 * k){
            int left = i;
            int right = Math.min(i+k-1 , n - 1);

            char ch[] = s.toCharArray();

            while(left < right){
                char temp = ch[left];
                ch[left] = ch[right];
                ch[right] = temp;

                left++;
                right--;
            }
            s = new String(ch);
        }
        return s;
    }
}
