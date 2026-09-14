class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int ans[] = new int[n];

        int next[] = new int[101];

        Arrays.fill(next , n);

        for(int i = n-1; i>= 0 ; i--){
            int warmDay = n;

            for(int temp = temperatures[i] + 1; temp<=100 ; temp++){
                warmDay = Math.min(warmDay , next[temp]);
            }

            if(warmDay != n){
                ans[i] = warmDay - i;
            }

            next[temperatures[i]] = i;
        }
        return ans;
    }
}