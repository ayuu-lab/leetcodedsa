import java.util.*;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        Map<Integer,Boolean> map = new HashMap<>();
        for(int i = 0 ; i<nums1.length;i++){
            map.put(nums1[i],false);
        }
        for(int i = 0 ; i<nums2.length;i++){
            if(map.containsKey(nums2[i])){
                map.put(nums2[i],true);
            }
        }
        for(int key:map.keySet()){
            if(map.get(key)) list.add(key);
        }
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i); // Automatically unboxed to primitive int
        }
        return arr;
    }
}