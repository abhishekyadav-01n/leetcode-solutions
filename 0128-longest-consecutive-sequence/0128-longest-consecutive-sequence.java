class Solution {
    public int longestConsecutive(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int num : nums){
            pq.add(num);
        }

        int len = 0;
        int maxLen = 0;
        int prev = 0;

        while(!pq.isEmpty()){
            int num = pq.poll();
            if(len == 0){
                prev = num;
                len = 1;
            }
            else if(prev == num) continue;
            else if(prev == num-1) len++;
            else len = 1;

            prev = num;

            maxLen = Math.max(len, maxLen);
        }
        return maxLen;
    }
}