class Solution {
    public void moveZeroes(int[] nums) {
        int i=0 , j = 0;
        while(i<nums.length && j<nums.length){
            if(nums[j]!=0){
                swap(nums,i,j);
                i++;
                j++;
            }
            else j++;
        }
    }
    public static void swap(int arr[],int f,int s){
        int temp = arr[f];
        arr[f] = arr[s];
        arr[s] = temp;
    }
}