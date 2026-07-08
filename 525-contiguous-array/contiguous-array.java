class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int sum= 0 , max = 0;
        for(int i=0;i<nums.length;i++){
            sum+=(nums[i]==1)?1:-1;
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
            else{
                int len = i - (map.get(sum));
                max = Math.max(len,max);
            }
        }
        return max;
        
    }
}