class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int arr[] = new int[n+m];
        // int min = Math.min(n,m);
        // int max = Math.max(n,m);
        int k = 0,i = 0, j = 0;
        while( (i<m && j<n) ){
            if(nums1[i] >= nums2[j]){
                arr[k++] = nums2[j];
                j++;
            }
            else{
                arr[k++] = nums1[i];
                i++;
            }
        }
        while(i<m){
            arr[k++] = nums1[i];
            i++;
        }
        while(j<n){
            arr[k++] = nums2[j];
            j++;
        }
        for(i = 0; i<k ; i++){
            nums1[i] = arr[i];
        }
    }
}