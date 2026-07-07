class Solution {
    public int maxDistance(int[] colors) {
        int ans = -1;
        for(int i=0;i<colors.length;i++){
            for(int j=i+1;j<colors.length;j++){
                if(colors[i]!=colors[j]){
                    ans = Math.max(ans,Math.abs(j-i));
                }
        }
        }
        return ans;
    }
}