class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int n) {
        int sum = 0;
        int a = n;
        while(n>0){
            int rem = n % 10;
            sum += rem;
            n = n/10;
        }
        if(a % sum == 0){
            return sum;
        }
        else{
            return -1;
        }
    }
}