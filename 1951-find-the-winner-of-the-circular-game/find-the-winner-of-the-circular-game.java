class Solution {
    public int findTheWinner(int n, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1;i<=n;i++){
            list.add(i);
        }
        k = k-1;
        int i = 0;
        return ans(list,k,i);
    }
    public static int ans(ArrayList list,int k,int i){
        if(list.size()==1) return (Integer)list.get(0);
        i = (i+k)%list.size();
        list.remove(i);
        return ans(list,k,i);
    }
}