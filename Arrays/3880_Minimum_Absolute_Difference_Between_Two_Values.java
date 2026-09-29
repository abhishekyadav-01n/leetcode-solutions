class Solution {
    public int minAbsoluteDifference(int[] nums) {
        int diff = Integer.MAX_VALUE;

        HashMap<Integer,Integer> map = new HashMap<>();
        boolean x = false;
        

        for(int i = 0; i<nums.length ; i++){
            map.put(nums[i],i);
            if( map.containsKey(1) && map.containsKey(2) ){
                x = true;
                int idx = Math.abs(map.get(2) - map.get(1));
                diff = Math.min(diff , idx);
            }
        }
        if(!x) return -1;
        return diff;
    }
}
