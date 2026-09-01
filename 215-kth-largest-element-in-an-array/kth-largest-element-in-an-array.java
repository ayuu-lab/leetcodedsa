class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int len = nums.length;
        for(int i=0;i<len;i++){
            pq.offer(nums[i]);
        }
        while(pq.size()!=k){
            pq.poll();
        }
        System.out.println(pq);
        return pq.peek();

    }
}