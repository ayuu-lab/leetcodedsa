class Solution {
    public void func(int[] nums,List<List<Integer>> ans,List<Integer> temp,int i ) {
        if(i==nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[i]);
        func(nums,ans,temp,i+1);
        temp.remove(temp.size()-1);
        func(nums,ans,temp,i+1);
        return;
        
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        func(nums,ans,temp,0);
        return ans;
    }
}