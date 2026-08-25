class Solution {
    public int missingMultiple(int[] nums, int k) {
        boolean freq[] = new boolean[101];

        for(int num : nums) freq[num] = true;

        for(int multiple = k;  ; multiple += k ){
            if(multiple > 100 || !freq[multiple]) return multiple;
        }
    }
}