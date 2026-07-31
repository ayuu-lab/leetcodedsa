class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        sol(ans,cur,0,nums);
        return ans;
    }
    public static void sol(List<List<Integer>> ans,List<Integer> cur,int i,int[] arr){
        if(i==arr.length){
            ans.add(new ArrayList<>(cur));
            return;
        }
        //pick
        cur.add(arr[i]);
        sol(ans,cur,i+1,arr);
        cur.remove(cur.size()-1);
        //not pick
        sol(ans,cur,i+1,arr);
    }
}