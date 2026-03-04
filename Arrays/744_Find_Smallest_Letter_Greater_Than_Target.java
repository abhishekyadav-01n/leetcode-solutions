class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int n = letters.length;
        int min = Integer.MAX_VALUE;
        int ch = 0;
        for(int i = 0; i<n ; i++){
            ch = letters[i] - target;
            if(ch>0){
                min = Math.min(ch,min);
            }
        }
        if(ch<=0){
            return letters[0];
        }
        int a = 0;
        a = min + target;
        char x = (char) a;
        return x;
        
    }
}
