class Solution {
    public int percentageLetter(String s, char letter) {
        int len = s.length();
        int count = 0;
        char []temp = s.toCharArray();
        for(char i : temp){
            if(letter==i) count++;
        }
        float count1 = count;
        return (count*100)/len;
    }
}