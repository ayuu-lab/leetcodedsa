class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int temp[] = new int[nums.length];
        int k = 0 , j = nums.length-1;
        for(int i:nums){
            if(i%2==0) temp[k++] = i;
            else temp[j--] = i;
        }
        return temp;
    }
}