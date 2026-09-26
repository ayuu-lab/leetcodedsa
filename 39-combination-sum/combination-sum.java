class Solution {
    public void func(List<List<Integer>> ans, List<Integer> temp, int target, int cs, int[] nums, int i) {
        if (cs >= target || i == nums.length) {
            if (cs == target) {
                ans.add(new ArrayList<>(temp));
            }
            return;
        }
        temp.add(nums[i]);
        func(ans, temp, target, cs + nums[i], nums, i);
        temp.remove(temp.size() - 1);
        func(ans, temp, target, cs , nums, i + 1);
        return;
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        func(ans, temp, target, 0, candidates, 0);
        return ans;

    }
}