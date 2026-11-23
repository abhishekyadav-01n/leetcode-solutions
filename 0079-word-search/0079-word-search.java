class Solution { // optimized
    boolean ans = false;
    public boolean exist(char[][] board, String word) {
        for(int i = 0; i<board.length ; i++){
            for(int j = 0; j<board[0].length ; j++){
                dfs(board , i , j, word , 0);
                if(ans) return true;
            }
        }
        return ans;
    }
    public void dfs(char [][]board , int r, int c ,String word , int idx){
        if(idx == word.length()){
            ans = true;
            return;
        }
        if(r < 0 || c < 0 || r >= board.length || c >= board[0].length){
            return;
        }
        char ch = board[r][c];
        
        if(ch != word.charAt(idx) || ch == '#'){
            return;
        }
        board[r][c] = '#';

        dfs(board , r , c+1 , word , idx+1);
        dfs(board , r , c-1 , word , idx+1);
        dfs(board , r-1 , c , word , idx+1);
        dfs(board , r+1 , c , word , idx+1);

        board[r][c] = ch;
    }
}