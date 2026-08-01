class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        ArrayList<List<Integer>> ans = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        sol(ans,cur,0,nums);
        return ans;
    }
    public static void sol(ArrayList<List<Integer>> ans,List<Integer> cur,int i,int[] arr){
        if(i==arr.length){
            ans.add(new ArrayList<>(cur));
            return;
        }
        //pick
        cur.add(arr[i]);
        sol(ans,cur,i+1,arr);
        while( i<arr.length-1 && arr[i]==arr[i+1] ){
            i++;
        }
        cur.remove(cur.size()-1);
        //not pick
        sol(ans,cur,i+1,arr);
    }




    
}