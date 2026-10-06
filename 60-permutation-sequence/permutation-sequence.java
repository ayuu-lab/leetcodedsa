class Solution {
    public void func(char[] arr,List <String> ans , int i ){
        if(i==arr.length){
            String s = new String(arr);
            ans.add(s);
            return;
        }
        for(int j = i ; j<arr.length;j++){
            swap(arr,i,j);
            func(arr,ans,i+1);
            swap(arr,i,j);
        }
        return;
    }
    public void swap(char[] arr,int j, int i ){
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public String getPermutation(int n, int k) {
        List <String> ans = new ArrayList<>();
        char []arr =  new char[n];
        for(int i=0;i<n;i++){
            arr[i] = (char)(49+i);
        }
        func(arr,ans,0);
        Collections.sort(ans);
        return ans.get(k-1);
    }
}