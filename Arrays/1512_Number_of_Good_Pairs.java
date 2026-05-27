class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length ; i++){
            map.put(nums[i], map.getOrDefault(nums[i] , 0) + 1);
        }
        int sum = 0;
        for(int i : map.values()){
            if(i != 1){
                sum += (i * (i-1) ) / 2;
            }
        }
        return sum;
    }
}
