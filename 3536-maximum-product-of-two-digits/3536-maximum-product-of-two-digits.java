class Solution {
    public int maxProduct(int n) {
        int arr[] = new int[10];
        while(n != 0){
            int rem = n % 10;
            arr[rem]++;
            n /= 10;
        }
        int ans = 1;
        int num = 2;
        for(int i = 9; i>=0 ; i--){
            if(arr[i] > 0 && num > 0){
                ans *= i;
                arr[i]--;
                i++;
                num--;
            }
        }
        return ans;
    }
}