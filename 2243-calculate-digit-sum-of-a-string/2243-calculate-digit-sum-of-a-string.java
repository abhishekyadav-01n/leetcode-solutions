class Solution {
    public String digitSum(String s, int k) {
        if(k == 1 || s.length() <= k) return s;
        

        StringBuilder sb = new StringBuilder();
        int sum = 0;

        for(int i = 0; i<s.length() ; i++){
            if(i > 0 && i % k == 0){
                sb.append(sum);
                sum = 0;
            }
            sum += Integer.parseInt(s.charAt(i)+"");
            if(i == s.length()-1) sb.append(sum);
        }
        if(sb.length() > k) return digitSum(sb.toString() , k);
        return sb.toString();
    }
}