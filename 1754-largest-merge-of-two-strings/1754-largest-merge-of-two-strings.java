class Solution {
    public String largestMerge(String word1, String word2) {
        StringBuilder sb = new StringBuilder();

        int n1 = word1.length();
        int n2 = word2.length();

        int i = 0, j = 0;

        while(i < n1 && j < n2){
            char ch1 = word1.charAt(i);
            char ch2 = word2.charAt(j);

            if(ch1 < ch2){
                sb.append(ch2);
                j++;
            }
            else if(ch1 > ch2){
                sb.append(ch1);
                i++;
            }
            else{
                int x = i;
                int y = j;

                while(x < n1 && y < n2 && word1.charAt(x) == word2.charAt(y)){
                    x++;
                    y++;
                }

                if(y == n2 || (x < n1 && word1.charAt(x) > word2.charAt(y))){
                    sb.append(ch1);
                    i++;
                }
                else{
                    sb.append(ch2);
                    j++;
                }
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