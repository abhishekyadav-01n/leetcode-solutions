class Solution {
    public int binarySearch(int arr[], int l , int r, int tar){
        if(l > r){
            return -1;
        }
        if(l == r){
            if(arr[l] == tar){
                return l;
            }
            else{
                return -1;
            }
        }
        else{
            int mid = l + (r-l)/2;

            if(arr[mid] == tar){
                return mid;
            }
            else if(arr[mid] > tar){
                return binarySearch(arr , l , mid-1 , tar);
            }
            else{
                return binarySearch(arr, mid+1, r, tar);
            }
        }
    }
    public int search(int[] nums, int target) {
        return binarySearch(nums,0, nums.length-1, target);
    }
}
