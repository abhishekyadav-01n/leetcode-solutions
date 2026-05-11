class Solution {
    public boolean reorderedPowerOf2(int n) {
        char arr[] = Integer.toString(n).toCharArray();
        Arrays.sort(arr);

        for(int i = 0; i<31 ; i++){
            int power = 1<<i;

            char chars[] = Integer.toString(power).toCharArray();
            Arrays.sort(chars);
            if(Arrays.equals(arr, chars)) return true;
        }
        return false;
    }
}
