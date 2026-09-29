class Solution {
    public int[] findDegrees(int[][] matrix) {
        int n = matrix.length;

        int nums[] = new int[n];
        
        int x = 0;
        
        for(int i = 0; i<n ; i++){
            int count = 0;
            for(int j = 0; j<n ; j++){
                if(matrix[i][j] == 1) count++;
            }
            nums[x++] = count;
        }
        return nums;
    }
}
