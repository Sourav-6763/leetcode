class Solution {
    public void rotate(int[][] matrix) {
        int rows = matrix.length;
        int column = matrix[0].length;
       
        int[][] ab = new int[rows][column];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < column; j++) {
                ab[i][j] = matrix[i][j];
            }
        }
        int column2 = matrix[0].length-1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < column; j++) {
                matrix[j][column2]=ab[i][j];
            }
            column2--;
        }
    }
}