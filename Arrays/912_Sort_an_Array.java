class Solution {

    int Partition(int arr[], int low , int high){
        int random = low + (int)(Math.random() * (high - low + 1));
        int temp1 = arr[random];
        arr[random] = arr[high];
        arr[high] = temp1;

        int pivot = arr[high];
        int i = low - 1;

        for(int j = low; j<high ; j++){
            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }
    void QuickSort(int nums[], int low , int high){
        if(low < high){
            int pi = Partition(nums , low , high);
            QuickSort(nums,low , pi-1);
            QuickSort(nums, pi+1 , high);
        }
    }
    public int[] sortArray(int[] nums) {
        QuickSort(nums , 0 , nums.length-1);
        return nums;
    }
}
