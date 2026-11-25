class MapSum {
    class TrieNode{
        TrieNode children[];
        int val;

        TrieNode(){
            children = new TrieNode[26];
            val = 0;
        }
    }
    TrieNode root;
    HashMap<String ,Integer> map;
    public MapSum() {
        root = new TrieNode();
        map = new HashMap<>();
    }
    
    public void insert(String key, int val) {

        int old = map.getOrDefault(key , 0);
        int diff = val - old;

        map.put(key , val);

        TrieNode curr = root;

        for(int i = 0; i<key.length() ; i++){
            int idx = key.charAt(i)-'a';

            if(curr.children[idx] == null){
                curr.children[idx] = new TrieNode();
            }
            curr = curr.children[idx];
            curr.val += diff;
        }
    }
    
    public int sum(String prefix) {
        TrieNode curr = root;

        for(int i = 0; i<prefix.length() ; i++){
            int idx = prefix.charAt(i)-'a';

            if(curr.children[idx] == null){
                return 0;
            }

            curr = curr.children[idx];
        }
        return curr.val;
    }
}

/**
 * Your MapSum object will be instantiated and called as such:
 * MapSum obj = new MapSum();
 * obj.insert(key,val);
 * int param_2 = obj.sum(prefix);
 */