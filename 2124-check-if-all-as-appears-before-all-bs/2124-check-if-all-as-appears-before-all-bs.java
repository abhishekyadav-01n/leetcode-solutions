class Solution {
    public boolean checkString(String s) {
        boolean check = false;

        for(int i = 0; i<s.length() ; i++){
            char ch = s.charAt(i);

            if(check && ch == 'a'){
                return false;
            }

            if(ch == 'b') check = true;
        }
        return true;
    }
}