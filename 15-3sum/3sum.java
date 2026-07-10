import java.util.Arrays;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        ArrayList<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int l = i + 1;
            int r = n - 1;
            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if (sum == 0) {
                    res.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    while (l < r && nums[l] == nums[l + 1]) l++;
                    while (l < r && nums[r] == nums[r - 1]) r--;
                    l++;
                    r--;
                } 
                else if (sum > 0) r--;
                else l++;
            }
        }
        

        // List<List<Integer>> temp = new ArrayList<>();
        // for(int i=0;i<nums.length;i++){
        //     if(i!=0 && nums[i]==nums[i-1]) continue;
        //     for(int j=i+1;j<nums.length;j++){
        //         for(int k=j+1;k<nums.length;k++){
        //             List<Integer> temp1 = new ArrayList<>();
        //             if(nums[i]+nums[j]+nums[k]==0){
        //                 temp1.add(nums[i]);
        //                 temp1.add(nums[j]);
        //                 temp1.add(nums[k]);
        //                 temp.add(temp1);
        //             }
        //         }
        //     }
        // }
        return res;
    }
}