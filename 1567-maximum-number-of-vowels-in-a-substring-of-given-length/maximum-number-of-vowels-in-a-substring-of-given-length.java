class Solution {
    public int maxVowels(String s, int k) {
        char arr[] = s.toCharArray();
        int count = 0;
        int i = 0;
        int j = 0;
        int max = 0;
        while (j < arr.length) {
            if (j - i + 1 <= k) {
                if (arr[j] == 'a' || arr[j] == 'e' || arr[j] == 'i' || arr[j] == 'o' || arr[j] == 'u') {
                    count++;
                }
                j++;
            } else {
                
                if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u') {
                    count--;
                }
                i++;
            }
            max = Math.max(max, count);
             
        }
       
        return max;
    }
}