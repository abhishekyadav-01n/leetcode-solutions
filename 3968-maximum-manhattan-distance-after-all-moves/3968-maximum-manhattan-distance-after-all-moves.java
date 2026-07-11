class Solution {
    public int maxDistance(String moves) {
        int countU = 0,countD = 0, countR = 0, countL = 0, countDas = 0;
        int n = moves.length();

        int arr[] = {0,0};

        for(int i = 0; i<n ; i++){
            char ch = moves.charAt(i);
            if(ch == 'L') countL++;
            else if(ch == 'R') countR++;
            else if(ch == 'U') countU++;
            else if(ch == 'D') countD++;
            else countDas++;
        }

        if(countL > countR) countL += countDas;
        else if(countL <= countR) countR += countDas;

        
        return Math.abs(countL - countR) + Math.abs(countU - countD);
    }
}