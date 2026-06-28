class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] diff = new int[101]; // 1950 -> 2050

        for (int[] log : logs) {
            diff[log[0] - 1950]++;
            diff[log[1] - 1950]--;
        }

        int maxPopulation = 0;
        int currentPopulation = 0;
        int answer = 1950;

        for (int i = 0; i < 101; i++) {
            currentPopulation += diff[i];

            if (currentPopulation > maxPopulation) {
                maxPopulation = currentPopulation;
                answer = 1950 + i;
            }
        }
        return answer;
    }
}