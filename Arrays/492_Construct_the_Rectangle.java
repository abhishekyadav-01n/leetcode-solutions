class Solution {
    public int[] constructRectangle(int area) {
        int max = 0;
        for(int i = 1; i*i <= area ; i++){
            if(area % i == 0){
                max = area / i;
            }
        }
        int min = area / max;

        return new int[]{max,min};
    }
}
