class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        char[][] board = new char[n][n];
        
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        solve(res, n, 0, board);
        return res;
    }

    // Main backtracking method
    public void solve(List<List<String>> res, int n, int row, char[][] board) {
        if (row == n) {
            List<String> current = new ArrayList<>();
            for (char[] r : board) {
                current.add(new String(r));
            }
            res.add(current);
            return;
        }

        for (int col = 0; col < n; col++) {
            if (isValid(col, row, board, n)) {
                board[row][col] = 'Q';
                solve(res, n, row + 1, board);
                board[row][col] = '.'; 
            }
        }
    }

    // Check if we can safely place a queen
    public boolean isValid(int col, int row, char[][] board, int n) {
        // Check same column
        for (int i = row-1; i >= 0; i--) {
            if (board[i][col] == 'Q') return false;
        }

        // Check upper-left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') return false;
        }

        // Check upper-right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 'Q') return false;
        }

        return true;
    }
}
