class Solution {
    public long removeZeros(long n) {
        long num = 0;
        long x = 1;
        while(n != 0){
            int rem = (int) (n % 10);
            if(rem == 0){
                n /= 10;
                continue;
            }
            num = rem * x + num;
            x *= 10;
            n /= 10;
        }
        return num;
    }
}
