class Solution {
    public String mostCommonWord(String p, String[] b) {
        HashMap<String,Integer> map = new HashMap<>();
        String arr[] = p.split("[\\p{Punct}\\s]+");
        for(String i:arr){
            i = i.toLowerCase();
            char temp[] = i.toCharArray();
            String s = "";
            for(char ch:temp){
                if(ch>=97 && ch<=123){
                    s+=ch;
                }
            }
            map.put(s,map.getOrDefault(s,0)+1);
        }
        for(String ss : b){
            map.remove(ss);
        }
        int max = -1;
        String ans = "";
        for(String sss:map.keySet()){
            if(map.get(sss)>max){
                max=map.get(sss);
                ans=sss;
            }
        }
        return ans;
    }
}