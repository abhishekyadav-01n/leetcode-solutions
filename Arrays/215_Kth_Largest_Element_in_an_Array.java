class Solution {
    public int partition(int nums[] , int L, int R){
        int pivot = nums[L];
        int i = L+1; // for handling , nums[] = {1} , k = 1
        int j = R;

        while( i <= j){
            if(nums[i] < pivot && nums[j] > pivot){
                //Swap
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
            }

            if(nums[i] >= pivot){
                i++;
            }

            if(nums[j] <= pivot){
                j--;
            }
        }
        int temp = nums[L];
        nums[L] = nums[j];
        nums[j] = temp;

        return j; // pivot at jth Index
    }
    public int findKthLargest(int[] nums, int k) {

        int n = nums.length;
        int l = 0;
        int r = n - 1;

        int pivotIdx = 0; // kth largest pivot element - nums[k-1] 
                          // Partition in decending order
        while(true){
            pivotIdx = partition(nums , l , r);

            if(pivotIdx == k-1) break;
            else if(pivotIdx > k-1){ // needed 2nd largest but currently 4th
                r = pivotIdx - 1;
            }
            else{
                l = pivotIdx + 1;
            }
        }
        return nums[pivotIdx];
    }
}
