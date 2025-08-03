class Solution {
    public void rotate(int[][] matrix) {
        int rows = matrix.length;
        int column = matrix[0].length;
        int[][] ab = new int[rows][column];

        for (int i = 0; i < column; i++) {
            for (int j = 0; j < rows; j++) {
                ab[i][j] = matrix[i][j];
            }
        }

        int col = matrix[0].length - 1;
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < rows; j++) {
                matrix[j][col] = ab[i][j];
            }
            col--;
        }

    }
}