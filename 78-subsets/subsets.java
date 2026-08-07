class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        solve(ans,cur,nums,0);
        return ans;
    }
    public void solve(List ans,List cur,int[] nums,int i){
        if(i==nums.length){
            ans.add(new ArrayList<>(cur));
            return;
        }
        //pick
        cur.add(nums[i]);
        solve(ans,cur,nums,i+1);
        cur.remove(cur.size()-1);
        //not pick
        solve(ans,cur,nums,i+1);
    }
}