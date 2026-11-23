class Solution {
    class TrieNode{
        TrieNode children[] = new TrieNode[26];
        String word = null;
    }
    TrieNode root = new TrieNode();

    public List<String> findWords(char[][] board, String[] words) {
        for(String word : words){
            insert(word);
        }

        List<String> ans = new ArrayList<>();

        for(int i = 0; i<board.length ; i++){
            for(int j = 0; j<board[0].length ; j++){
                dfs(board , i , j, root , ans);
            }
        }

        return ans;
    }
    public void insert(String word){
        TrieNode curr = root;

        for(int i = 0; i<word.length() ; i++){
            int idx = word.charAt(i) - 'a';

            if(curr.children[idx] == null){
                curr.children[idx] = new TrieNode();
            }

            curr = curr.children[idx];
        }
        curr.word = word;
    }

    public void dfs(char board[][] , int r , int c , TrieNode node , List<String> ans){
        if(r < 0 || c < 0 || r >= board.length || c >= board[0].length){
            return;
        }

        char ch = board[r][c];

        if(ch == '#' || node.children[ch - 'a'] == null){
            return;
        }

        node = node.children[ch-'a'];

        if(node.word != null){
            ans.add(node.word);
            node.word = null;
        }

        board[r][c] = '#';

        dfs(board , r , c+1 , node , ans);
        dfs(board , r+1 , c , node , ans);
        dfs(board , r-1 , c , node , ans);
        dfs(board , r , c-1 , node , ans);

        board[r][c] = ch;
    }
}