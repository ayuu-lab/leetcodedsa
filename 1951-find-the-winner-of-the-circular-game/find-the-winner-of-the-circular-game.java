class Solution {
    public int func(ArrayList <Integer> ans,int i,int k){
        if(ans.size()==1) return ans.get(ans.size()-1);
        i = (i+k)%ans.size();
        ans.remove(i);
        return func(ans,i,k);
    }
    public int findTheWinner(int n, int k) {
        ArrayList <Integer> ans = new ArrayList<>();
        for(int i=1;i<=n;i++){
            ans.add(i);
        }
        return func(ans,0,k-1);

    }
}