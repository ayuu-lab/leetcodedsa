class Solution {
    public int findPeakElement(int[] nums) {
        int i=1;
        for(i=1;i<nums.length;i++){
            if(nums[i-1]>nums[i]){
                return i-1;
            }
        }
        return i-1;
    }
}