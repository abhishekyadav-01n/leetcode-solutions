class Solution {
    public int numSubmatrixSumTarget(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int count = 0;

        for(int top = 0; top < rows ; top++){
            int[] colSum = new int[cols];

            for(int bottom = top ; bottom < rows ; bottom++){
                for(int col = 0; col < cols ; col++){
                    colSum[col] += matrix[bottom][col];
                }

                HashMap<Integer, Integer> map = new HashMap<>();
                map.put(0 , 1);

                int prefixSum = 0;
                for(int num : colSum){
                    prefixSum += num;
                    if(map.containsKey(prefixSum - target)){
                        count += map.get(prefixSum - target);
                    }
                    map.put(prefixSum , map.getOrDefault(prefixSum , 0) + 1);
                }
            }
        }
        return count;
    }
}