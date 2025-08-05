class Solution {
    public void rotate(int[][] matrix) {
        int rows = matrix.length;
        int column = matrix[0].length;

        for(int i=0;i<rows;i++){
            for(int j=i+1;j<column;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
    
        for(int i=0;i<rows;i++){
            int left=0;
            int right=column-1;
            while(left<right){
                int temp=matrix[i][right];
                matrix[i][right]=matrix[i][left];
                matrix[i][left]=temp;
                left++;
                right--;
            }
        }
      
    

    }
}