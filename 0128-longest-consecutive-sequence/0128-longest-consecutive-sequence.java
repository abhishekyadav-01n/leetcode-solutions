class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int i : nums){
            set.add(i);
        }

        int maxLen = 0;

        for(int num : set){
            if(!set.contains(num - 1)){
                int len = 1;
                int current = num;

                while(set.contains(current + 1)){
                    current++;
                    len++;
                }

                maxLen = Math.max(len , maxLen);
            }
        }
        return maxLen;
    }
}