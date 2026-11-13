/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int maxWidth = 0;
    public int widthOfBinaryTree(TreeNode root) {
        List<Integer> first = new ArrayList<>();
        dfs(root , 0 , 0 , first);
        return  maxWidth;
        
    }
    public void dfs(TreeNode root , int level , int index , List<Integer> first){
        if(root == null) return;

        if(level == first.size()){
            first.add(index);
        }

        maxWidth = Math.max(maxWidth , index - first.get(level) + 1);

        dfs(root.left , level+1 , 2 * index , first);
        dfs(root.right , level+1 , 2 * index + 1 , first);
    }
}