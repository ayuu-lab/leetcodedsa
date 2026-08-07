class Solution {
    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                // Start backtracking search from every cell
                if (solve(board, 0, i, j, word)) {
                    return true;
                }
            }
        }
        return false;
    }
    public boolean solve(char[][] arr , int k , int i , int j  , String w){
        boolean temp =  false;
        if(k==w.length()) return true;
        if(i<0 || j<0 || i>=arr.length || j>=arr[0].length){
            return false;
        }
        if(arr[i][j]==w.charAt(k)){
            char temp1 = arr[i][j];
            arr[i][j] = '.' ;
            k++;
            temp = solve(arr,k,i+1,j,w) || solve(arr,k,i-1,j,w) || solve(arr,k,i,j+1,w) || solve(arr,k,i,j-1,w);
            arr[i][j] = temp1;
        }
        return temp;
    }
}