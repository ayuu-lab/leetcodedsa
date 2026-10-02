class Solution {
    public void func(List<List<Integer>> ans, List<Integer> temp, int target, int cs, int[] nums, int i) {
        if (cs >= target || i == nums.length) {
            if (cs == target) {
                ans.add(new ArrayList<>(temp));
            }
            return;
        }
        temp.add(nums[i]);
        func(ans, temp, target, cs + nums[i], nums, i + 1);
        temp.remove(temp.size() - 1);
        while (i < nums.length - 1 && nums[i] == nums[i + 1]) {

            i++;

        }
        func(ans, temp, target, cs, nums, i + 1);
        return;
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        func(ans, temp, target, 0, candidates, 0);
        return ans;
    }
}