class Solution {
    public boolean checkDivisibility(int n) {
        int digitSum = 0;
        int digitProd = 1;

        int num = n;

        while(num != 0){
            int rem = num % 10;
            digitSum += rem;
            digitProd *= rem;
            num /= 10;
        }
        if(n % (digitSum + digitProd) == 0 ) return true;

        return false;
    }
}