import java.util.*;
class Solution {
    public int lastStoneWeight(int[] s) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int len = s.length;
        for(int i=0;i<len;i++){
            pq.offer(s[i]);
        }
        while(pq.size()> 1){
            int n1 = pq.poll();
            int n2 = pq.poll();
            
            if(n1>n2) pq.offer(n1-n2);
        }
        return pq.isEmpty() ? 0 : pq.poll();
    }
}