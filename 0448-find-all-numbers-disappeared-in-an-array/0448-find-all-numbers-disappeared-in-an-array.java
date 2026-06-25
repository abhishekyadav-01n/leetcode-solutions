class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;

        List<Integer> list = new ArrayList<>();
        int freq[] = new int[n+1];
        for(int i = 0; i<n ;i++){
            freq[nums[i]]++;
        }

        for(int i = 1; i<n+1 ; i++){
            if(freq[i] == 0) list.add(i);
        }
        return list;
    }
}