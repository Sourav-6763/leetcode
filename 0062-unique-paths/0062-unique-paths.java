class Solution {
    public int uniquePaths(int m, int n) {
        int[][] t = new int[m][n];
        
        // Initialize all cells to -1
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                t[i][j] = -1;
            }
        }
        
        return solver(0, 0, m, n, t);
    }

    public int solver(int i, int j, int m, int n, int[][] t) {
        // Base case: reached destination
        if (i == m - 1 && j == n - 1) return 1;

        // Out of bounds
        if (i >= m || j >= n) return 0;

        // If already computed
        if (t[i][j] != -1) return t[i][j];

        // Recursive calls: move right and down
        int right = solver(i, j + 1, m, n, t);
        int down = solver(i + 1, j, m, n, t);

        // Store result in memoization table
        t[i][j] = right + down;
        return t[i][j];
    }
}
