class Solution {
    class TrieNode{
        TrieNode children[] = new TrieNode[2];
    }
    TrieNode root = new TrieNode();

    void insert(int num){
        TrieNode curr = root;

        for(int i =  31; i>=0 ; i--){
            int bit = (num >>> i) & 1;

            if(curr.children[bit] == null){
                curr.children[bit] = new TrieNode();
            }
            curr = curr.children[bit];
        }
    }
    int getMaxXor(int num){
        TrieNode curr = root;

        int ans = 0;

        for(int i = 31; i>=0 ; i--){
            int bit = (num >>> i) & 1;
            int opposite = 1-bit;

            if(curr.children[opposite] != null){
                ans |= (1 << i);
                curr = curr.children[opposite];
            }
            else{
                curr = curr.children[bit];
            }
        }
        return ans;
    }
    public int findMaximumXOR(int[] nums) {
        for(int num : nums){
            insert(num);
        }

        int maxXor = 0;

        for(int num : nums){
            maxXor = Math.max(maxXor , getMaxXor(num));
        }

        return maxXor;
    }
}