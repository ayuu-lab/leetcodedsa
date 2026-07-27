class Solution {
    public boolean searchMatrix(int[][] mat, int target) {
        // int RL = m.length;
        // int CL = m[0].length;
        // for(int i=0;i<=RL;i++){
        //     if(m[i][0]<= target && target<=m[i][CL-1]){
        //         int s = 0;
        //         int e = CL -1;
        //         while(s<=e){
        //             int mid = s+(e-s)/2;
        //             if(m[i][mid]==target) return true;
        //             if(m[i][mid]<target) s=mid+1;
        //             else e=mid-1;
        //         }
        //         return false;
        //     }
        // }
        // return false;
        int row = mat.length;
        int col = mat[0].length;
        int s = 0;
        int e = row*col-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            int newrow = mid/col;
            int newcol = mid%col;
            if(mat[newrow][newcol]==target) return true;
            else if(mat[newrow][newcol]<target) s=mid+1;
            else e=mid-1;
        }
        return false;
    }
}