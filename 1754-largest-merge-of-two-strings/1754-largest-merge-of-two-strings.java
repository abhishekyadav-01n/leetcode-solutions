class Solution {
    public String largestMerge(String word1, String word2) {
        StringBuilder sb = new StringBuilder();

        int n1 = word1.length();
        int n2 = word2.length();

        int i = 0, j = 0;

        while(i < n1 && j < n2){
            char ch1 = word1.charAt(i);
            char ch2 = word2.charAt(j);

            if(ch1 == ch2){
                if( (word1.substring(i) ).compareTo(word2.substring(j)) >= 0){
                    sb.append(ch1);
                    i++;
                }
                else{
                    sb.append(ch2);
                    j++;
                }
            }
            else if(ch1 < ch2){
                sb.append(ch2);
                j++;
            }
            else{
                sb.append(ch1);
                i++;
            }
        }
        while(i < n1){
            sb.append(word1.charAt(i));
            i++;
        }
        while(j < n2){
            sb.append(word2.charAt(j));
            j++;
        }

        return sb.toString();
    }
}