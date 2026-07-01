class Solution {
    public int maxIceCream(int[] costs, int coins) {

        int freq[] = new int[100001];

        for(int cost : costs){
            freq[cost]++;
        }

        int bars = 0;
        
        for(int i = 1; i<=100000 ; i++){
            if(freq[i] == 0) continue;

            int buy = Math.min(freq[i] , coins / i);
            bars += buy;

            coins -= (i * buy);

            if(coins < i){
                break;
            }
        }
        return bars;
    }
}