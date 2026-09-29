class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();

        s = new StringBuilder(s).reverse().toString();

        int n = s.length();

        for(int i = 0; i<n ; i++){
            if(s.charAt(i) == ' ') continue;
            StringBuilder word = new StringBuilder();

            while(i<n && s.charAt(i) != ' '){ 
                word.append(s.charAt(i));
                i++;
            }

            word.reverse();

            if(word.length() != 0){
                sb.append(" ").append(word);
            }
        }
        return sb.toString().trim();
    }
}
