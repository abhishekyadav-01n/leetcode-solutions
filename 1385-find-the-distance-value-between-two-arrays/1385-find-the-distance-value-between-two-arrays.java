class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count = 0;
        Arrays.sort(arr2);

        for(int i = 0; i<arr1.length ; i++){
            int val = arr1[i];
            int left = 0;
            int right = arr2.length-1;

            boolean find = false;

            while(left <= right){
                int mid = left + (right - left) / 2;

                if(Math.abs(arr2[mid] - arr1[i]) <= d){
                    find = true;
                    break;
                }
                else{
                    if((arr2[mid] - arr1[i]) < 0){
                        left = mid+1;
                    }
                    else{
                        right = mid-1;
                    }
                    
                }
            }
            if(!find) count++;
        }
        return count;
    }
}