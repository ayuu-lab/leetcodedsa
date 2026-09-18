class Solution {
    public static boolean func(int []nums,int i, Boolean dp[] ){
        if (i >= nums.length)
            return false;
        if (i == nums.length - 1)
            return true;
        if(dp[i]!=null) return dp[i];
        boolean ans = false;
        for(int j = 1 ; j<=nums[i];j++){
            ans = func(nums,j+i,dp);
            if(ans){
                return ans;
            }
        }
        return dp[i]=ans;
    }

    public boolean canJump(int[] nums) {
        int len = nums.length;
        Boolean dp[] = new Boolean[len];
        return func(nums , 0,dp);
    }
}