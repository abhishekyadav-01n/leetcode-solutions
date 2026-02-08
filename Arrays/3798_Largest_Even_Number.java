class Solution {
    public String largestEven(String s) {
        int n = s.length();
        for(int i = n-1; i>=0 ; i--){
            if(s.charAt(i) == '1'){
                s = s.substring(0, i) + s.substring(i + 1);
            }
            else{
                break;
            }
        }
        return s;
    }
}