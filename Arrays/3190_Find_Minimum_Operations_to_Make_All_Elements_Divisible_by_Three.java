class Solution {
    public int minimumOperations(int[] arr) {
        int n = arr.length;
        int count = 0;
        for(int i : arr){
            if( i % 3 == 1 || i % 3 == 2){
                count++;
            }
        }
        return count;
    }
}