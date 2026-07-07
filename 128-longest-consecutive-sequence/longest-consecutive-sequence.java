class Solution {
    public int longestConsecutive(int[] nums) {
        int max = 0;
        Set<Integer> set = new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        for(int i:set){
            if(!set.contains(i-1)){
                int start = i+1 ;
                int count = 1;
                while(set.contains(start)){
                    count++;
                    start++;
                }
                max = Math.max(max,count);
            }
        }
        return max;
    }
}