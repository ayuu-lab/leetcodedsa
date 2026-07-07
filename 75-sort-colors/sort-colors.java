class Solution {
    public void sortColors(int[] nums) {
        int i = 0 , j = 0 , k = nums.length - 1;
        while(j<=k){
            if(nums[j]==2){
                swap(nums,j,k);
                k--;
            }
            else if(nums[j]==0){
                swap(nums,i,j);
                i++;
                j++;
            }
            else j++;
        }
    }
    public static void swap(int []arr,int f , int l){
        int temp = arr[f];
        arr[f] = arr[l];
        arr[l] = temp ;
    }
}