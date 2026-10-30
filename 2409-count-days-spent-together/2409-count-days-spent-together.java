class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int day = 0;
        int arr[] = new int[12];
        for(int i = 1; i<12 ; i++){
            if(i == 4 || i == 6 || i == 9 || i == 11){
                day += 30;
                arr[i] = day;
            }
            else if(i == 2){
                day += 28;
                arr[i] = day;
            }
            else{
                day += 31;
                arr[i] = day;
            }
        }

        int aliceArrM = Integer.parseInt(arriveAlice.substring(0,2));
        int aliceArrD = Integer.parseInt(arriveAlice.substring(3,5));
        int aliceLeaM = Integer.parseInt(leaveAlice.substring(0,2));
        int aliceLeaD = Integer.parseInt(leaveAlice.substring(3,5));

        int bobArrM = Integer.parseInt(arriveBob.substring(0,2));
        int bobArrD = Integer.parseInt(arriveBob.substring(3,5));
        int bobLeaM = Integer.parseInt(leaveBob.substring(0,2));
        int bobLeaD = Integer.parseInt(leaveBob.substring(3,5));

        int aliceArrDay = arr[aliceArrM-1] + aliceArrD;
        int aliceLeaDay = arr[aliceLeaM-1] + aliceLeaD;

        int bobArrDay = arr[bobArrM-1] + bobArrD;
        int bobLeaDay = arr[bobLeaM-1] + bobLeaD;

        int ans = Math.min(aliceLeaDay,bobLeaDay) - Math.max(aliceArrDay, bobArrDay);
        if(ans < 0) return 0;
        return ans+1;
    }
}