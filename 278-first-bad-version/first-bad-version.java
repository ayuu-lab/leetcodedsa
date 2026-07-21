/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int fs = 0 , en = n , ans = -1;
        while(fs<=en){
            int mid = fs+(en-fs)/2;
            if(isBadVersion(mid)){
                ans = mid;
                en = mid-1;
            }
            else{
                fs = mid+1;
            }
        }
        return ans;
    }
    
}