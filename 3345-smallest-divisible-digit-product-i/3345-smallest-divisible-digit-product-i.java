class Solution {
    public int smallestNumber(int n, int t) {
        int prod = 1;
        int a = n;
        
        while(true){
            a = n;
            prod = 1;
            while(a != 0){
                prod *= a % 10;
                a /= 10;
            }
            if(prod % t == 0) return n;
            n++;
        }
    }
}