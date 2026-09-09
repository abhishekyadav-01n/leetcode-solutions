class Solution {
    public long countCommas(long n) {
        long count = 0;
        if(n < 1000) return 0;

        count += Math.min(n , 999999) - 999;

        if(n <= 999999){
            return count;
        }

        count += 2 * (Math.min(n , 999999999L) - 999999);

        if(n <= 999999999L){
            return count;
        }

        count += 3 * (Math.min(n , 999999999999L) - 999999999L);

        if(n <= 999999999999L){
            return count;
        }

        count += 4*(Math.min(n, 999999999999999L) - 999999999999L);

        if(n <= 999999999999999L){
            return count;
        }
        count += 5;
        return count;
    }
}