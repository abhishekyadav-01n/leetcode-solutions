class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        int lessNumber = 0;
        int equalNumber = 0;
        for(int i : nums){
            if(i<target){
                lessNumber++;
            }
            else if(i==target){
                equalNumber++;
            }
        }
        for(int i =0 ;i<equalNumber ; i++){
            list.add(lessNumber+i);
        }
        return list;
    }
}
