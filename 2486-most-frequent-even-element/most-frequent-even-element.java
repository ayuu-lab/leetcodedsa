class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int ans = Integer.MAX_VALUE , max = -1 ; 
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        System.out.println(map);
        for(int i:map.keySet()){
            if(i%2==0){ //check even 
                if(map.get(i)>max){ //
                    ans = i;
                    max = map.get(i);
                }
                if(map.get(i)==max){ //
                    ans = Math.min(ans,i);
                    max = map.get(i);
                }
                
            }
        }
        return ans<Integer.MAX_VALUE? ans:-1;
    }
}