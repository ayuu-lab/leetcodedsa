class Solution {
    public boolean validbox(char[][] board, int i, int j, char ch) {
        i = (i / 3) * 3;
        j = (j / 3) * 3;
        for (int k = i; k < i + 3; k++) {
            for (int l = j; l < j + 3; l++) {
                if (board[k][l] == ch) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean validrowcolumn(char[][] board, int i, int j, char ch) {
        for (int k = 0; k < board.length; k++) {
            if (board[i][k] == ch || board[k][j] == ch) {
                return false;
            }
        }
        return true;
    }

    public void solveSudoku(char[][] board) {
        solve(board, 0, 0);
    }

    public boolean solve(char[][] board, int i, int j) {
        if (i == board.length)
            return true;
        int nr = 0, nc = 0;
        if (j == 8) {
            nr = i + 1;
            nc = 0;
        } else {
            nr = i;
            nc = j + 1;
        }
        if (board[i][j] != '.') {
            return solve(board, nr, nc);
        }
        for (char k = '1'; k <= '9'; k++) {
            if (validbox(board, i, j, k)) {
                if (validrowcolumn(board, i, j, k)) {
                    board[i][j] = k;
                    if (solve(board, nr, nc)) {
                        return true;
                    }
                    board[i][j] = '.';
                }
            }
        }

        return false;

    }
}