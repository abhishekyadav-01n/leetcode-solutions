class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int n = operations.length;
        int sm = 0;
        for(int i = 0; i<n ; i++){
            String s = operations[i];

            switch (s.charAt(1)){
                case '+':
                 sm++;
                 break;
                default:
                 sm--;
            }
        }
        return sm;
    }
}
