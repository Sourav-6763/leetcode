class Solution {
    public void solve(char[][] board) {
        int row=board.length;
        int col=board[0].length;
        for(int i=0;i<col;i++){
            if(board[0][i]=='O'){
                bfs(board,0,i);
            }
            if(board[row-1][i]=='O'){
                bfs(board,row-1,i);
            }
        }

        for(int i=0;i<row;i++){
            if(board[i][0]=='O'){
                bfs(board,i,0);
            }
            if(board[i][col-1]=='O'){
                bfs(board,i,col-1);
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(board[i][j]=='O'){
                    board[i][j]='X';
                }else if(board[i][j]=='#'){
                    board[i][j]='O';
                }
            }
        }
    }
    public void bfs(char[][] board,int i,int j){
        if(i<0 ||j<0|| i>board.length-1||j>board[0].length-1|| board[i][j]!='O'){
            return;
        }
        board[i][j]='#';

        bfs(board,i-1,j);
        bfs(board,i+1,j);
        bfs(board,i,j-1);
        bfs(board,i,j+1);
    }
}