class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map1 = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int temp:nums1){
            map1.put(temp,map1.getOrDefault(temp,0)+1);
        }
        for(int temp:nums2){
            if(map1.containsKey(temp)){
                if(map1.get(temp)>0){
                    list.add(temp);
                    map1.put(temp,map1.getOrDefault(temp,0)-1);
                }
                
            }
        }
        int arr[] = new int[list.size()];
        for(int i =0 ; i<arr.length;i++){
            arr[i]=list.get(i);
        }
        return arr;
        // for(int temp: map2.keySet()){
        //     if(map2.get(temp)==0) continue;
        //     if(map2.get(temp)==1) arr[i++] = temp;
        //     else{
        //         int j = map2.get(temp) , d = 0;
        //         while(d<j){
        //             arr[i++] = temp ; 
        //             d++;
        //         }
        //     }
        // }
        // return arr;
    }
}