class Solution {
    public long sumAndMultiply(int n) {
        int sum = 0;

        String str = new String(n + "");
        String s = "";

        for(int i = 0; i<str.length() ; i++){
            char ch = str.charAt(i);
            if(ch != '0'){
                s += ch;
                sum += ch - '0';
            }
        }
        if(s.isEmpty()) return 0;
        long ans = Long.parseLong(s) * sum;
        return ans;

    }
}