class Solution {
    private int findJobs(int i, int jobs[][]){
        int left = i+1;
        int target = jobs[i][1];
        int right = jobs.length;

        while(left < right){
            int mid = left + (right - left) / 2;

            if(jobs[mid][0] >= target){
                right = mid;
            }
            else{
                left = mid+1;
            }
        }
        return left;
    }
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        int n = profit.length;
        int jobs[][] = new int[n][3];
        int dp[] = new int[n+1];

        for(int i = 0; i<n ; i++){
            jobs[i][0] = startTime[i];
            jobs[i][1] = endTime[i];
            jobs[i][2] = profit[i];
        }
        Arrays.sort(jobs , (a,b) -> (a[0] - b[0]));

        for(int i = n-1; i>=0 ; i--){
            int next = findJobs(i ,jobs);
            int taken = dp[next] + jobs[i][2];
            int skip = dp[i+1];
            dp[i] = Math.max(skip , taken);
        }
        return dp[0];
    }
}