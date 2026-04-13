class Solution {
    public boolean isPowerOfThree(int n) {
        long x = 3;
        if(n==1 || n==3) return true;
        if(n<3){
            return false;
        }

        while(x<=n){
            x *= 3;
            if(x==n){
                return true;
            }
        }
        return false;
    }
}