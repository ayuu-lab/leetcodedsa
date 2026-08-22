class Solution {
    public int maxScore(int[] arr, int k) {
        int i=0;
        int rs = 0;
        int ls = 0;
        int ans = 0;
        int j=arr.length - 1 ;
        while(i!=k){
            ls += arr[i];
            i++;
        }
        ans = ls;
        i = k-1;
        while(i>=0){
            rs+=arr[j];
            j--;
            ls-=arr[i];
            i--;
            ans = Math.max(ans,ls+rs);
        }
        return ans;
        // int i = 0, sum=0;
        // int j = arr.length -1 ;
        // for(int s=0; s<k; s++){
        //     if(arr[i]>arr[j]){
        //         sum+=arr[i];
        //         i++;
        //     }else{
        //         sum+=arr[j];
        //         j--;
        //     }
        // }return sum;

    }
}