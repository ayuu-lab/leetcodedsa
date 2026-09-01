class Solution {
    static class Pair implements Comparable<Pair> {
        int key, value;
        Pair(int key, int value) {
            this.key = key;
            this.value = value;
        }
        @Override
        public int compareTo(Pair p) {
            return this.value - p.value;
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        List<Pair> list = new ArrayList<>();
        for (int key : map.keySet()) {
            pq.offer(new Pair(key, map.get(key)));
            if(pq.size()>k) pq.poll();
        }
        int []ans = new int[k];
        int i = 0;
        while(!pq.isEmpty()){
            ans [i++] = pq.poll().key;
        }
        return ans;
    }
}