class Solution {
    public boolean canConstruct(String r, String m) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<m.length();i++){
            map.put(m.charAt(i),map.getOrDefault(m.charAt(i),0)+1);
        }
        for(int i=0;i<r.length();i++){
            if(map.containsKey(r.charAt(i))){
                map.put(r.charAt(i),map.get(r.charAt(i))-1);
                if(map.get(r.charAt(i))==0){
                    map.remove(r.charAt(i));
                }
            }else{
                return false;
            }
        }
        return true;
    }
}