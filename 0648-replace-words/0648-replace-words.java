class Solution {
    
    StringBuilder s = new StringBuilder();
    class TrieNode{
        TrieNode children[] = new TrieNode[26];
        String word = null;
    }
    TrieNode root = new TrieNode();
    public String replaceWords(List<String> dictionary, String sentence) {
        for(String word : dictionary){
            insert(word);
        }
        StringBuilder ans = new StringBuilder();
        String[] parts = sentence.split(" ");

        for(String part : parts){
            String prefix = search(part);

            if(ans.length() > 0) ans.append(" ");

            if(prefix != null){
                ans.append(prefix);
            }
            else{
                ans.append(part);
            }
        }
        return ans.toString();
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
    public String search(String word){
        TrieNode curr = root;

        for(int i = 0; i<word.length() ; i++){
            int idx = word.charAt(i)-'a';

            if(curr.children[idx] == null){
                return null;
            }
            curr = curr.children[idx];

            if(curr.word != null){
                return curr.word;
            }
        }
        return null;
    }
}