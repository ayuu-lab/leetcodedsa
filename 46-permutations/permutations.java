class Solution {
    public void func(int[] nums, List<List<Integer>> ans, List<Integer> temp, boolean[] used, int i) {
        if (temp.size() == nums.length) {
            ans.add(new ArrayList<>(temp));
            return;
        }
        for (int j = 0; j < nums.length; j++) {
            if (!used[j]) {
                used[j] = true;
                temp.add(nums[j]);
                func(nums, ans, temp, used, j);
                temp.remove(temp.size() - 1);
                used[j] = false;
            }
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        func(nums, ans, temp, used, 0);
        return ans;
    }
}