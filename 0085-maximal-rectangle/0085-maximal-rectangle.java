class Solution {
    private int calculateArea(int heights[]){
        int n = heights.length;
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;

        for(int i = 0; i<=n ; i++){
            int currentHeight = (i == n) ? 0 : heights[i];

            while(!stack.isEmpty() &&
                                currentHeight <= heights[stack.peek()] ){
                int h = heights[stack.pop()];
                int width;

                if(stack.isEmpty()){
                    width = i;
                }
                else{
                    width = i - stack.peek() - 1;
                }
                maxArea = Math.max(maxArea , h * width);
            }
            stack.push(i);
        }
        return maxArea;
    }
    public int maximalRectangle(char[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int maxArea = 0;

        int height[] = new int[cols];

        for(int row = 0; row < rows ; row++){
            for(int col = 0; col < cols ; col++){
                if(matrix[row][col] == '1'){
                    height[col]++;
                }
                else{
                    height[col] = 0;
                }
            }
            maxArea = Math.max(maxArea, calculateArea(height));
        }
        return maxArea;
    }
}