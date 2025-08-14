class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=matrix.length;
        int col=matrix[0].length;
        for(int i=0;i<row;i++){   
            for(int j=col-1;j>=0;j--){
                if(matrix[i][j]==target){
                    return true;
                }
                else if(matrix[i][j]<target){
                    break;
                }
                else{
                    continue;
                }
            }
        }
        return false;
    }
}