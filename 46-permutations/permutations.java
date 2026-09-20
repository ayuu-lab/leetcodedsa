import java.util.*;
class Solution {
    public void func(int[] nums,int i,List<List<Integer>> ans) {
        if(i==nums.length){
            List<Integer> temp = new ArrayList<>();
            for (int num : nums) {
                temp.add(num);
            }
            ans.add(temp);
            return;
        }
        for(int j=i;j<nums.length;j++){
            swap(nums,i,j);
            func(nums,i+1,ans);
            swap(nums,i,j);
        }
        return;
    }
    public void swap(int []arr,int i,int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        return;
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        func(nums,0,ans);
        return ans;
    }
}