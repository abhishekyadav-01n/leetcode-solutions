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
    HashMap<Integer,Integer> map = new HashMap<>();
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int []idx = {postorder.length-1};
        
        for(int i = 0; i<inorder.length ; i++){
            map.put(inorder[i] , i);
        }

        return construct(postorder , 0, postorder.length-1 , idx);
    }

    public TreeNode construct(int[] postorder , int left , int right , int []idx){
        if(left > right) return null;

        int rootVal = postorder[idx[0]--];
        TreeNode root = new TreeNode(rootVal);

        int mid = map.get(rootVal);

        root.right = construct(postorder , mid+1 , right , idx);
        root.left = construct(postorder , left , mid-1 , idx);
        

        return root;
    }
}