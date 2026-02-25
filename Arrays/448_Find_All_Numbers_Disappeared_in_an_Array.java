public class 448_Find_All_Numbers_Disappeared_in_an_Array {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int n = nums.length;

        List<Integer> result = new ArrayList<>();

        for(int i = 0; i<n ; i++){
            set.add(nums[i]);
        }
        for(int i = 1; i<=n ; i++){
            if(!set.contains(i)){
                result.add(i);
            }
        }
        return result;
    }
}
