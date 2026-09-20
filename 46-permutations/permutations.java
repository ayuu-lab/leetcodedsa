class Solution {
    public void func(int[] nums,boolean[]check,List<List<Integer>> ans,List<Integer> temp,int i) {
        if(i==nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int j=0;j<nums.length;j++){
            if(!check[j]){
                temp.add(nums[j]);
                check[j]=true;
                func(nums,check,ans,temp,i+1);
                temp.remove(temp.size()-1);
                check[j]=false;
            }
        }
        return;
        
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        boolean []check = new boolean[nums.length];
        func(nums,check,ans,temp,0);
        return ans;

    }
}