class Solution {
    public boolean canJump(int[] nums) {
        int l = nums.length;
        int f = l-1;
        for(int i=l-2;i>=0;i--){
            if(i+nums[i]>=f){
                f=i;
            }
        }
        return f==0;
    }
}