class Solution {
    public int[] scoreValidator(String[] events) {
        
        int score = 0;
        int counter = 0;

        for(int i = 0; i<events.length ; i++){
            if(counter == 10) continue;
                
            if(events[i].equals("W")) counter++;
            else if(events[i].equals("WD") || events[i].equals("NB")) score++;
            else{
                score += Integer.parseInt(events[i]);
            }
        }

        return new int[]{score , counter};
    }
}
