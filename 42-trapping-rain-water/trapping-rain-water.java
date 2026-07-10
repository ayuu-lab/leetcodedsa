class Solution {
    public int trap(int[] height) {
        int n = height.length , l = 0 , r = n-1 , ans = 0 , lm = 0 , rm = 0;
        while(l<r){
            if(height[l]<height[r]){
                lm = Math.max(lm,height[l]);
                ans+=lm-height[l];
                l++;
            }
            else {
                rm = Math.max(rm,height[r]);
                ans+=rm-height[r];
                r--;
            }
        }
        return ans;



        // int n = height.length , lm= 0 , rm = 0 , ans = 0;
        // int []ls = new int[n];
        // int []rs = new int[n];
        // for(int i=0;i<n;i++){
        //     lm = Math.max(height[i],lm);
        //     ls[i] = lm;
        // }
        // for(int i=n-1;i>-1;i--){
        //     rm = Math.max(height[i],rm);
        //     rs[i] = rm;
        // }
        // for(int i=1;i<n-1;i++){
        //     ans+= Math.min(ls[i],rs[i])-height[i];
        // }
        // return ans;
    }
    
}