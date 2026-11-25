class Solution {
    public int findMaximumXOR(int[] nums) {
        int ans = 0;

        for(int i = 31; i>=0 ; i--){
            int mask = ans | (1 << i);

            HashSet<Integer> set = new HashSet<>();

            for(int num : nums){
                set.add(num & mask);
            }

            int condidate = ans | (1 << i);

            boolean found = false;

            for(int prefix : set){
                int req = prefix ^ condidate;

                if(set.contains(req)){
                    found = true;
                    break;
                }
            }

            if(found){
                ans = condidate;
            }
        }
        return ans;
    }
}