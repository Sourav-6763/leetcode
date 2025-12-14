class Solution {
    public int uniquePaths(int m, int n) {
        int gird[][]=new int [m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 || j==0){
                    gird[i][j]=1;
                }
                else{
                    gird[i][j]=gird[i-1][j]+gird[i][j-1];
                }
            }
        }
        return gird[m-1][n-1];
    }
}