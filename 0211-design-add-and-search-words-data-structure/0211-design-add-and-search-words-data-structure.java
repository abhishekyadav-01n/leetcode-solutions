class WordDictionary {
    class TrieNode{
        TrieNode children[];
        boolean isEnd;

        public TrieNode(){
            children = new TrieNode[26];
            isEnd = false;
        }
    }
    TrieNode root;

    public WordDictionary() {
        root = new TrieNode();
    }
    
    public void addWord(String word) {
        TrieNode curr = root;

        for(int i = 0; i<word.length() ; i++){
            int idx = word.charAt(i) - 'a';

            if(curr.children[idx] == null){
                curr.children[idx] = new TrieNode();
            }
            curr = curr.children[idx];
        }
        curr.isEnd = true;
    }
    
    public boolean search(String word) {
        return dfs(root , word , 0);
    }

    private boolean dfs(TrieNode curr, String word , int idx){
        if(idx == word.length()) return curr.isEnd;

        char ch = word.charAt(idx);

        if(ch == '.'){
            for(int i = 0; i<26 ; i++){
                if(curr.children[i] != null){
                    if(dfs(curr.children[i] , word , idx+1)){
                        return true;
                    }
                }
            }
            return false;
        }

        int pos = ch - 'a';

        if(curr.children[pos] == null) return false;

        return dfs(curr.children[pos] , word , idx+1);
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */