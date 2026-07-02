class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums1.length > nums2.length){
            return intersect(nums2, nums1);
        }

        ArrayList<Integer> arr = new ArrayList<>();
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i = 0; i<nums1.length ; i++){
            map.put(nums1[i] , map.getOrDefault(nums1[i] , 0) + 1);
        }

        for(int i = 0; i<nums2.length ; i++){
            if(map.getOrDefault(nums2[i] , 0) > 0){
                arr.add(nums2[i]);
                map.put(nums2[i] , map.get(nums2[i])-1);
            }
        }
        int[] ans = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            ans[i] = arr.get(i);
        }
        
        return ans;
    }
}