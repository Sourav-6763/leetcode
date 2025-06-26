class Solution {
    public void setZeroes(int[][] matrix) {
        ArrayList<List<Integer>> ab = new ArrayList<>();
        int rows = matrix.length;
        int cols = matrix[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    ab.add(Arrays.asList(i, j));
                }
            }
        }

        System.out.println(ab);
        for (List<Integer> p : ab) {
            int row = p.get(0);
            int col = p.get(1);
            for (int i = 0; i < cols; i++) {
                matrix[row][i] = 0;
            }
            for (int j = 0; j < rows; j++) {
                matrix[j][col] = 0;

            }

        }

    }
}