class Solution {
    public int longestPalindrome(String s) {
        int sum = 0;
        boolean isodd = false;
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0 ; i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for(char ele : map.keySet()){
            int freq = map.get(ele);
            if(freq%2==0){ //even 
                sum+=freq;
            }else{
                isodd = true;
                sum+=(freq-1);
            }
        }
        return isodd? sum+1:sum;
    }
}