class Solution {
    public int findTheWinner(int n, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1;i<=n;i++){
            list.add(i);
        }
        return solve(list,0,k-1);
    }
    public Integer solve(ArrayList arr,int i,int k){
        if(arr.size()==1) return (Integer)arr.get(0);
        i = (i+k)%arr.size();
        arr.remove(i);
        return solve(arr,i,k);

    }
}