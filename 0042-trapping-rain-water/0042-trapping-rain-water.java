class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int leftMax[] = new int[n];
        int rightMax[] = new int[n];

        leftMax[0] = height[0];
        rightMax[n-1] = height[n-1];

        int totalArea = 0;

        for(int i = 1, j = n-2 ; i<n && j>=0 ; i++,j--){
            leftMax[i] = Math.max(height[i] , leftMax[i-1]);
            rightMax[j] = Math.max(height[j] ,rightMax[j+1]);
        }

        
        for(int i = 0; i<n ; i++){
            totalArea += ( Math.min(leftMax[i] , rightMax[i]) - height[i]);
        }
        return totalArea;
    }
}